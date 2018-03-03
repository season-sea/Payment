package com.pay.independent.rest.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

/**
 * 多数据源配置
 * create at 2018-03-03 by season
 */

@Configuration
public class DataSourceConfig {

    @Bean(name = "dataSourceMasterDS")
    @ConfigurationProperties(prefix = "spring.datasource.dbmaster") // application.properteis中对应属性的前缀
    public DataSource dataSourceMaster() {
        return DataSourceBuilder.create().build();
    }




    @Bean(name = "dataSourceSlaverDS")
    @ConfigurationProperties(prefix = "spring.datasource.dbslaver") // application.properteis中对应属性的前缀
    public DataSource dataSourceSlaver() {
        return DataSourceBuilder.create().build();
    }

}
