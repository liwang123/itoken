package com.thingtrust.token.service;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.thingtrust.token.*;
import com.thingtrust.token.common.enums.BizErrorCodeEnum;
import com.thingtrust.token.common.model.ResponseResult;
import com.thingtrust.token.data.EmailRepository;
import com.thingtrust.token.data.PaymentTokenRepository;
import com.thingtrust.token.data.TokenRepository;
import com.thingtrust.token.domain.Email;
import com.thingtrust.token.domain.PaymentToken;
import com.thingtrust.token.domain.Token;
import com.thingtrust.token.domain.example.PaymentTokenExample;
import com.thingtrust.token.domain.example.TokenExample;
import com.thingtrust.token.entity.TokenApi;
import com.thingtrust.token.entity.TokenApiAddress;
import com.thingtrust.token.util.OkHttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;

@Service
@Slf4j
public class TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    @Autowired
    private PaymentTokenRepository paymentTokenRepository;

    @Autowired
    private EmailRepository emailRepository;

    @Value("${thingtrust.token.nodeurl}")
    private String nodeUrl;

    public TokenAddressDTO saveToken(final String json) {
        TokenAddressDTO tokenAddressDTO = null;
        final TokenApi tokenApi = JSON.parseObject(json, TokenApi.class);
        tokenApi.setTicker(tokenApi.getTicker().toUpperCase());
        final Token token = new Token();
        token.setCrtTime(LocalDateTime.now());
        BeanUtils.copyProperties(tokenApi, token);
        final String url = nodeUrl + "/address";
        final String body = OkHttpUtils.get(url, null);
        final JSONObject jsonObject = JSON.parseObject(body);
        final String address = (String) jsonObject.get("address");
        token.setAddress(address);
        if (StringUtils.isNoneBlank(address)) {
            tokenRepository.insert(token);
            tokenAddressDTO = TokenAddressDTO.builder()
                    .address(address)
                    .build();
        }
        return tokenAddressDTO;
    }

    public ResponseResult modifyToken(final Long id) {
        final Token token = tokenRepository.selectById(id);
        final String url = nodeUrl + "/issueasset";

        final TokenApiAddress tokenApiAddress = new TokenApiAddress();
        BeanUtils.copyProperties(token, tokenApiAddress);

        final String body = OkHttpUtils.post(url, JSON.parseObject(JSON.toJSONString(tokenApiAddress)));
        if (body == null) {
            return ResponseResult.failure(BizErrorCodeEnum.INTERNET_ERROR);
        } else {
            final JSONObject jsonObject = JSON.parseObject(body);
            final Integer errCode = jsonObject.getInteger("errCode");
            TokenAssetDTO tokenAssetDTO = TokenAssetDTO.builder().build();
            if (errCode != null && errCode.intValue() != 1) {
                final String assetID = jsonObject.getString("assetID");
                tokenAssetDTO.setAssetId(assetID);


                final TokenExample tokenExample = new TokenExample();
                tokenExample.createCriteria()
                        .andIdEqualTo(token.getId());
                tokenRepository.updateByExample(Token.builder()
                                .reviewStatus(2)
                                .operatorTime(LocalDateTime.now())
                                .payStatus(2)
                                .assetId(assetID)
                                .build()
                        , tokenExample);


                final PaymentTokenExample paymentTokenExample = new PaymentTokenExample();
                paymentTokenExample.createCriteria()
                        .andTokenIdEqualTo(token.getId());
                final PaymentToken paymentToken = paymentTokenRepository.selectOneByExample(paymentTokenExample);
                if (paymentToken == null) {
                    final Email email = Email.builder()
                            .email(token.getEmail())
                            .time(LocalDateTime.now())
                            .build();
                    emailRepository.insert(email);

                    paymentTokenRepository.insert(PaymentToken.builder()
                            .tokenId(token.getId())
                            .address(token.getAddress())
                            .assetId(assetID)
                            .assetName(token.getAssetName())
                            .descript(token.getDescript())
                            .emailId(email.getId().longValue())
                            .issuserName(token.getIssuserName())
                            .symbol(token.getTicker())
                            .build()
                    );
                }
                return ResponseResult.success(tokenAssetDTO);
            }else {
                return ResponseResult.failure(BizErrorCodeEnum.NOT_PAYMENT);
            }

        }

    }

    public ResponseResult getPaymentInfo(final String address) {
        final TokenExample tokenExample = new TokenExample();
        tokenExample.createCriteria()
                .andAddressEqualTo(address);

        final Token token = tokenRepository.selectOneByExample(tokenExample);
        if (token == null) {
            return ResponseResult.failure(BizErrorCodeEnum.ADDRESS_ERROR);
        }

        final String url = nodeUrl + "/checkbalance";
        final TokenApiAddress tokenApiAddress = new TokenApiAddress();
        BeanUtils.copyProperties(token, tokenApiAddress);
        final String str = JSON.toJSONString(tokenApiAddress);
        final String body = OkHttpUtils.post(url, JSON.parseObject(str));
        if (StringUtils.isNotBlank(body)) {
            final JSONObject jsonObject = JSON.parseObject(body);
            final Integer errCode = jsonObject.getInteger("errCode");
            if (errCode != null && errCode.intValue() != 1) {
                return ResponseResult.success(TokenForPaymentInfoDTO.builder()
                        .id(token.getId().longValue())
                        .errCode(errCode)
                        .build());
            } else {
                return ResponseResult.failure(BizErrorCodeEnum.NOT_PAYMENT);
            }
        } else {
            return ResponseResult.failure(BizErrorCodeEnum.INTERNET_ERROR);
        }

    }

    public ResponseResult queryTokenIssueInfo(final String assetId) {
        final String url = nodeUrl + "/assetstatus";
        final Map map = Maps.newHashMap();
        map.put("assetID", assetId);
        final String jsonPara = JSON.toJSONString(map);
        final String body = OkHttpUtils.get(url, JSON.parseObject(jsonPara));
        if (StringUtils.isNotBlank(body)) {
            final JSONObject jsonObject = JSON.parseObject(body);
            final Integer errCode = jsonObject.getInteger("errCode");
            return ResponseResult.success(TokenIssueInfoDTO.builder()
                    .errCode(errCode)
                    .build());
        } else {
            return ResponseResult.failure(BizErrorCodeEnum.INTERNET_ERROR);
        }
    }

    public TokenByAssetDTO queryTokenByAssetId(final String assetId) {
        final PaymentTokenExample paymentTokenExample = new PaymentTokenExample();
        paymentTokenExample.createCriteria()
                .andAssetIdEqualTo(assetId);
        final PaymentToken paymentToken = paymentTokenRepository.selectOneByExample(paymentTokenExample);
        if (paymentToken != null) {
            return TokenByAssetDTO.builder()
                    .assetName(paymentToken.getAssetName())
                    .issuserName(paymentToken.getIssuserName())
                    .symbol(paymentToken.getSymbol())
                    .build();
        } else {
            return null;
        }

    }

    public long queryIssueTokenCount() {
        final long count = paymentTokenRepository.countByExample(null);
        return count;
    }


}
