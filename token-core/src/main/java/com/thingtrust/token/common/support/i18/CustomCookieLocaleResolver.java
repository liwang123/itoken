package com.thingtrust.token.common.support.i18;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import java.util.Locale;

/**
 * 〈〉
 *
 * @author WangYu
 * @create 2018/5/15
 * @since 1.0.0
 */
public class CustomCookieLocaleResolver extends CookieLocaleResolver {

    private static final char UNDERLINE = '_';
    private static final char DASH = '-';

    public CustomCookieLocaleResolver() {
    }

    @Override
    protected Locale parseLocaleValue(String locale) {
        return locale == null ? this.getDefaultLocale() : StringUtils.parseLocaleString(locale.replace('-', '_'));
    }

    @Override
    protected String toLocaleValue(Locale locale) {
        return locale.toString();
    }
}
