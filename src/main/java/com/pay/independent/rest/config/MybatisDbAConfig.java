package com.pay.independent.rest.config;

/*import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;*/

/**
 * 配置mybatis的SqlSessionFactory分别使用不同的数据源
 */

/*@Configuration
@MapperScan(basePackages = {"com.pay.independent.dao"}, sqlSessionFactoryRef = "sqlSessionFactory1")*/
public class MybatisDbAConfig {

    /*@Autowired
    @Qualifier("dataSourceMasterDS")
    private DataSource dataSourceMasterDS;


    @Bean
    public SqlSessionFactory sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSourceMasterDS);
        return factoryBean.getObject();

    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory1());
        return template;
    }*/

}
