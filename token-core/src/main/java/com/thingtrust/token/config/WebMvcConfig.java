package com.thingtrust.token.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


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
        final SessionLocaleResolver slr = new SessionLocaleResolver();
        // 默认语言
        return slr;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        final LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        // 参数名
        lci.setParamName("lang");
        return lci;
    }

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

    @Bean
    public ThreadPoolTaskExecutor mvcTaskExecutor(){
        if (WebMvcConfig.executor == null) {
            WebMvcConfig.executor = new ThreadPoolTaskExecutor();
            WebMvcConfig.executor.setThreadNamePrefix("pool-executor-");
            //<!-- 线程池维护线程的最少数量 -->
            WebMvcConfig.executor.setCorePoolSize(5);
            //<!-- 线程池维护线程所允许的空闲时间 -->
            WebMvcConfig.executor.setKeepAliveSeconds(300);
            //<!-- 线程池维护线程的最大数量 -->
            WebMvcConfig.executor.setMaxPoolSize(20);
            //<!-- 线程池所使用的缓冲队列 -->
            WebMvcConfig.executor.setQueueCapacity(25);
        }
        return WebMvcConfig.executor;
    }

    @Override
    public void configureAsyncSupport(final AsyncSupportConfigurer configurer) {
        super.configureAsyncSupport(configurer);
        configurer.setTaskExecutor(mvcTaskExecutor());
    }

    @Override
    public void addCorsMappings(final CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .maxAge(3600);
    }
}
