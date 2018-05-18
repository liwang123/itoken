package com.thingtrust.token.rest;


import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.thingtrust.token.common.enums.BizErrorCodeEnum;
import com.thingtrust.token.common.enums.EmailTemplateEnum;
import com.thingtrust.token.common.model.ResponseResult;
import com.thingtrust.token.domain.Token;
import com.thingtrust.token.domain.TokenApi;
import com.thingtrust.token.service.MailService;
import com.thingtrust.token.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1/token")
@Slf4j
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private MailService mailService;

    @GetMapping(value = "/test")
    public ResponseResult getString(final Long id) {
        final String str = tokenService.getDemo(id);
        return ResponseResult.failure(BizErrorCodeEnum.PROGRMER_ERROR);
    }

    @GetMapping(value = "/mail")
    public ResponseResult sendMail(final int id) {
        final Map map = Maps.newHashMap();
        map.put("condition", "hahahahah");
        mailService.sendTemplateMail("76167050@qq.com", EmailTemplateEnum.ISSUE_ASSET_SUCCESS_MAIL, map);
        return ResponseResult.success();
    }

    /**
     * 保存发币信息
     *
     * @param request
     * @param response
     * @param session
     * @param json
     * @param vcode
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseResult insert(final HttpServletRequest request,
                                 final HttpServletResponse response,
                                 final HttpSession session,
                                 @RequestParam final String json,
                                 @RequestParam final String vcode) {
        if (StringUtils.isBlank(json) || StringUtils.isBlank(vcode)) {
            return ResponseResult.failure(4000, "The parameter is incorrect");
        }
        final String icode = (String) session.getAttribute("icode");
        TokenController.log.info("icode", icode);
        if (!vcode.toLowerCase().equals(icode)) {
            return ResponseResult.failure(4001, "Incorrect verification code.");
        }
        final TokenApi tokenApi = JSON.parseObject(json, TokenApi.class);
        tokenApi.setTicker(tokenApi.getTicker().toUpperCase());
        final Token token = new Token();
        final String body = null;
        final String entity = null;


        return null;
    }

}