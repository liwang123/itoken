package com.thingtrust.token.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;



import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;


/**
 * 〈〉
 *
 * @author WangYu
 * @create 2018/5/15
 * @since 1.0.0
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class WebMvcConfig extends WebMvcConfigurationSupport {

    private static ThreadPoolTaskExecutor executor = null;



    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        // 默认语言
        slr.setDefaultLocale(Locale.US);
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        // 参数名
        lci.setParamName("lang");
        return lci;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

    @Bean
    public ThreadPoolTaskExecutor mvcTaskExecutor(){
        if(executor == null){
            executor = new ThreadPoolTaskExecutor();
            executor.setThreadNamePrefix("pool-executor-");
            //<!-- 线程池维护线程的最少数量 -->
            executor.setCorePoolSize(5);
            //<!-- 线程池维护线程所允许的空闲时间 -->
            executor.setKeepAliveSeconds(300);
            //<!-- 线程池维护线程的最大数量 -->
            executor.setMaxPoolSize(20);
            //<!-- 线程池所使用的缓冲队列 -->
            executor.setQueueCapacity(25);
        }
        return executor;
    }



    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        super.configureAsyncSupport(configurer);
        configurer.setTaskExecutor(mvcTaskExecutor());
    }

}
