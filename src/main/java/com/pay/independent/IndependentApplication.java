package com.pay.independent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 配置动态数据源，将自带的配置去掉
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class IndependentApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndependentApplication.class, args);
	}
}
