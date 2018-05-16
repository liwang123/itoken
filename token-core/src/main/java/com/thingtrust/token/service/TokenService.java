package com.thingtrust.token.service;



import com.thingtrust.token.common.enums.BizErrorCodeEnum;
import com.thingtrust.token.data.TokenRepository;
import com.thingtrust.token.domain.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
