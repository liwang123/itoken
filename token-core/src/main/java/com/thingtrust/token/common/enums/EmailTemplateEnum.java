package com.thingtrust.token.common.enums;

public enum EmailTemplateEnum {
    PMM_LEVEL_ENUM_0(0, "", "");


    /**
     * 邮件类型
     */
    private final int type;
    /**
     * 邮件主题
     */
    private final String subject;

    /**
     * 邮件模板名称
     */
    private final String templateName;

    EmailTemplateEnum(final int type, final String subject, final String templateName) {
        this.type = type;
        this.subject = subject;
        this.templateName = templateName;
    }
}
