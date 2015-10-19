package com.leo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;
import com.leo.dao.TagMapper;

/**
 * Created by leo on 10/20/15.
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.leo.mapper")
public class DataBaseConfig {

    private final Logger log = LoggerFactory.getLogger(DataBaseConfig.class);

    @Bean
    @Primary
    // @ConfigurationProperties
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("12345");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/test");

        return druidDataSource;
    }

    @Bean
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {

        log.debug("> sqlSessionFactory");

        // return new SqlSessionFactoryBuilder().build(
        // this.getClass().getResourceAsStream("classpath:mybatis-config.xml"));

        final SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        sqlSessionFactory.setFailFast(true);
        return sqlSessionFactory.getObject();
    }

    @Bean
    public TagMapper tagMapper() throws Exception {
        SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sessionTemplate.getMapper(TagMapper.class);
    }
}
