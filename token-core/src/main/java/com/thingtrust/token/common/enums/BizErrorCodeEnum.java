package com.thingtrust.token.common.enums;


import com.thingtrust.token.common.support.i18.LocaleUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

public enum BizErrorCodeEnum implements ErrorCode{
    INTERNET_ERROR(3000),
    PROGRMER_ERROR(3001),
    ;

    private final int code;

    BizErrorCodeEnum(int code) {
        this.code = code;
    }


    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        String msg = LocaleUtils.getMessage("error.code.biz." + this.code);
        final Locale locale = LocaleContextHolder.getLocale();
        return msg;
    }

    @Override
    public String toString() {
        return "[" + this.getCode() + "]" + this.getMessage();
    }
}
