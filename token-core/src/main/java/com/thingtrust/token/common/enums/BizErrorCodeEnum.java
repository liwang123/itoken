package com.thingtrust.token.common.enums;


import com.thingtrust.token.common.support.i18.LocaleUtils;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

public enum BizErrorCodeEnum implements ErrorCode{
    PARA_ERROR(4000),
    VERIFICATION_CODE_ERROR(4001),
    SYSTEM_ERROR(4002),
    INTERNET_ERROR(4003),
    ADDRESS_ERROR(4004),
    NOT_PAYMENT(4005),;

    private final int code;

    BizErrorCodeEnum(final int code) {
        this.code = code;
    }


    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        final String msg = LocaleUtils.getMessage("error.code.biz." + code);
        final Locale locale = LocaleContextHolder.getLocale();
        return msg;
    }

    @Override
    public String toString() {
        return "[" + getCode() + "]" + getMessage();
    }
}
