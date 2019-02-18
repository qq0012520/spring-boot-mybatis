package com.example.mybatisintegration;

import com.p6spy.engine.spy.P6DataSource;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {


 /*   @Bean
    public P6DataSource setDataSource(DataSource dataSource){
        return new P6DataSource(dataSource);
    }
*/
}
