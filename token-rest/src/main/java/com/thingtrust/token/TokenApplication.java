package com.thingtrust.token;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TokenApplication {

    public static void main(final String[] args) {
        new SpringApplicationBuilder(TokenApplication.class).run(args);
    }

}
