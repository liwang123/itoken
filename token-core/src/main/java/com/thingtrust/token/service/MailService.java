package com.thingtrust.token.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;


/**
 * 〈send email service〉
 *
 * @author WangYu
 * @create 2018/5/17
 * @since 1.0.0
 */
@Service
@Slf4j
public class MailService {

    @Autowired
    private TemplateEngine templateEngine;


    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Value("${thingTrust.mail.alias}")
    private String alias;

    public void sendTextMail(final String to, final String subject, final String content) {
        final SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        try {
            javaMailSender.send(message);
            MailService.log.info("简单邮件已经发送。");
        } catch (final Exception e) {
            MailService.log.error("发送简单邮件时发生异常！", e);
        }
    }

    /**
     * 发送html邮件
     * @param to
     * @param subject
     * @param content
     */

    public void sendHtmlMail(final String to, final String subject, final String content) {

        final MimeMessage message = javaMailSender.createMimeMessage();

        try {
            //true表示需要创建一个multipart message
            final MimeMessageHelper helper = new MimeMessageHelper(message, true);
            try {
                helper.setFrom(new InternetAddress(from, alias));
            } catch (final UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);
            javaMailSender.send(message);
            MailService.log.info("html邮件发送成功");
        } catch (final MessagingException e) {
            MailService.log.error("发送html邮件时发生异常！", e);
        }
    }

    public void sendTemplateMail() {
        //创建邮件正文
        final Context context = new Context();
        context.setVariable("condition", "hahaha1212");
        final String emailContent = templateEngine.process("emailTemplate1", context);
        sendHtmlMail("76167050@qq.com","主题：这是模板邮件",emailContent);
    }

}
