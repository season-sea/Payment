package com.pay.independent.dynamic;

import com.pay.independent.rest.config.DataSourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component("dynamicDataSource")
public class DynamicDataSource extends AbstractRoutingDataSource {

    private static final Logger log = LoggerFactory.getLogger(DynamicDataSource.class);

    @Autowired
    private DataSourceConfig config;

    @Override
    protected Object determineCurrentLookupKey() {
        log.debug("数据源为{}", DataSourceContextHolder.getDB());

        return DataSourceContextHolder.getDB();
    }

    /**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     * @return
     */
    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(config.dataSourceMaster());

        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap(5);
        dsMap.put("payment-master", config.dataSourceMaster());
        dsMap.put("payment-slaver", config.dataSourceSlaver());

        dynamicDataSource.setTargetDataSources(dsMap);

        return dynamicDataSource;
    }

}
