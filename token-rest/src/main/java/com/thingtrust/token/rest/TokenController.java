package com.thingtrust.token.rest;


import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.inject.internal.util.Maps;
import com.thingtrust.token.*;
import com.thingtrust.token.common.enums.BizErrorCodeEnum;
import com.thingtrust.token.common.model.ResponseResult;
import com.thingtrust.token.common.mybatis.pager.PageInfo;
import com.thingtrust.token.domain.PaymentToken;
import com.thingtrust.token.entity.PageEntity;
import com.thingtrust.token.service.MailService;
import com.thingtrust.token.service.TokenService;
import com.thingtrust.token.util.ImageUtils.Captcha;
import com.thingtrust.token.util.ImageUtils.GifCaptcha;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1/token")
@Slf4j
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private MailService mailService;

    /**
     * 保存发币信息
     *
     * @param session
     * @param json
     * @param vcode
     * @return
     */
    @PostMapping(value = "/insert")
    public ResponseResult insert(final HttpSession session,
                                 @RequestParam final String json,
                                 @RequestParam final String vcode) {
        if (StringUtils.isBlank(json) || StringUtils.isBlank(vcode)) {
            return ResponseResult.failure(BizErrorCodeEnum.PARA_ERROR);
        }
        final String icode = (String) session.getAttribute("icode");
        TokenController.log.info("icode", icode);
        if (!vcode.toLowerCase().equals(icode)) {
            return ResponseResult.failure(BizErrorCodeEnum.VERIFICATION_CODE_ERROR);
        }
        final TokenAddressDTO tokenAddressDTO = tokenService.saveToken(json);
        if (tokenAddressDTO == null) {
            return ResponseResult.failure(BizErrorCodeEnum.SYSTEM_ERROR);
        } else {
            return ResponseResult.success(tokenAddressDTO);
        }
    }

    @GetMapping("/verification")
    public void getValidate(final HttpServletResponse response, final HttpSession session) {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/gif");
        /**
         * gif格式动画验证码
         * 宽，高，位数。
         */
        try {
            final Captcha captcha = new GifCaptcha(146, 33, 4);
            //输出
            captcha.out(response.getOutputStream());
            //存入Session
            session.setAttribute("icode", captcha.text().toLowerCase());

            final String icode = session.getAttribute("icode").toString();
            TokenController.log.info("session icode {}", icode);
        } catch (final IOException e) {
            TokenController.log.error("Exception = {}", e);
        }
    }

    @PostMapping("/update")
    public ResponseResult modifyTokenInfo(final Long id) {
        final ResponseResult responseResult = tokenService.modifyToken(id);
        return responseResult;
    }

    @GetMapping("/payment-info")
    public ResponseResult getPaymentInfo(final String address) {
        final ResponseResult responseResult = tokenService.getPaymentInfo(address);
        return responseResult;
    }

    @GetMapping("/query-token-issue-info")
    public ResponseResult queryTokenIssueInfo(final String assetId) {
        return tokenService.queryTokenIssueInfo(assetId);
    }

    @GetMapping("/query-token-detal")
    public ResponseResult queryTokenDetail(final String assetId) {
        final TokenByAssetDTO tokenByAssetDTO = tokenService.queryTokenByAssetId(assetId);
        return ResponseResult.success(tokenByAssetDTO);
    }

    @GetMapping("/check-verification")
    public ResponseResult checkVerification(final HttpSession session, final String vcode) {
        final String icode = (String) session.getAttribute("icode");
        if (!vcode.toLowerCase().equals(icode)) {
            return ResponseResult.failure(BizErrorCodeEnum.VERIFICATION_CODE_ERROR);
        } else {
            return ResponseResult.success();
        }
    }

    @GetMapping("/issue-token-count")
    public ResponseResult issueTokenCount() {
        final long count = tokenService.queryIssueTokenCount();
        return ResponseResult.success(IssueTokenCount.builder()
                .count(count)
                .build());
    }

    @GetMapping("/payment/detail")
    public ResponseResult queryPaymentDetal(String assetId){
        PaymentTokenDTO paymentTokenDTO = tokenService.queryPaymentTokenByAssetId(assetId);
        return ResponseResult.success(paymentTokenDTO);
    }

    @GetMapping("/payment/issuser-list")
    public ResponseResult queryAllIssuserToken(PageEntity pageEntity){
        PageInfo pageInfo = new PageInfo((pageEntity.getPage()-1)* pageEntity.getRows(),pageEntity.getRows());
        List<PaymentIssueTokenDTO> paymentTokenDTOList = tokenService.queryIssueTokenInfo(pageInfo);
        long count = tokenService.queryIssueTokenCount();
        pageInfo.setListObject(paymentTokenDTOList);
        pageInfo.setTotals(count);
        return ResponseResult.success(pageInfo);
    }




}