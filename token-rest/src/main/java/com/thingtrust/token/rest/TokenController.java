package com.thingtrust.token.rest;


import com.google.common.collect.Maps;
import com.thingtrust.token.common.enums.BizErrorCodeEnum;
import com.thingtrust.token.common.model.ResponseResult;
import com.thingtrust.token.service.MailService;
import com.thingtrust.token.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        map.put("condition", "condition");
        mailService.sendTemplateMail("76167050@qq.com", 1, map);
        return ResponseResult.success();
    }
}
