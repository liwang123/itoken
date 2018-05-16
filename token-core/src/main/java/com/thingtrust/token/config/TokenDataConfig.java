package com.thingtrust.token.config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = TokenDataConfig.PACKAGE, sqlSessionFactoryRef = "tokenSqlSessionFactory")
public class TokenDataConfig {
    static final String PACKAGE = "com.thingtrust.token.data";
    private static final String MAPPER_LOCATION = "classpath*:mybatis/mapper/*.xml";

    @Primary
    @ConfigurationProperties(prefix = "thingtrust.token.datasource.master")
    @Bean(name = "tokenDataSource")
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .build();
    }

    @Primary
    @Bean(name = "tokenTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("tokenDataSource") final DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean(name = "tokenSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("tokenDataSource") final DataSource dataSource)
            throws Exception {

        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        bean.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/*.xml"));
        return bean.getObject();

    }

    @Primary
    @Bean(name = "tokenSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("tokenSqlSessionFactory") final
                                                 SqlSessionFactory sqlSessionFactory)
            throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Primary
    @Bean(name = "tokenTransactionTemplate")
    public TransactionTemplate transactionTemplate(
            @Qualifier("tokenTransactionManager") final DataSourceTransactionManager transactionManager)
            throws Exception {
        return new TransactionTemplate(transactionManager);
    }
}
