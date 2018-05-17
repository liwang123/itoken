package com.thingtrust.token.service;



import com.thingtrust.token.common.enums.BizErrorCodeEnum;
import com.thingtrust.token.data.TokenRepository;
import com.thingtrust.token.domain.Token;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public String getDemo(int id){
        Token token = tokenRepository.selectById(id);
        System.out.println(BizErrorCodeEnum.PROGRMER_ERROR.getMessage());
//        System.out.println(token.getAddress());

        return "";
    }
}
