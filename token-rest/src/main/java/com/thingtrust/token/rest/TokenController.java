package com.thingtrust.token.rest;


import com.thingtrust.token.TestDTO;
import com.thingtrust.token.common.enums.BizErrorCodeEnum;
import com.thingtrust.token.common.model.ResponseResult;
import com.thingtrust.token.service.MailService;
import com.thingtrust.token.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/token")
@Slf4j
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private MailService mailService;

    @PostMapping(value = "/test")
    public ResponseResult getString(int id){
        String str = tokenService.getDemo(id);
        return ResponseResult.success();
    }

    @GetMapping(value = "/mail")
    public ResponseResult sendMail(int id){
        mailService.sendTextMail("76167050@qq.com","最近怎样！","挺好的!");
        return ResponseResult.success();
    }
}
