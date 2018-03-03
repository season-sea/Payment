package com.pay.independent.rest.config;

import org.springframework.context.annotation.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import java.nio.charset.Charset;
import java.util.List;

/**
 * <p>
 * User: season
 * <p>
 * Date: 18-02-26
 * <p>
 * Version: 1.0
 */
@Configuration
/*@ImportResource("classpath:spring/web-mvc.xml")
@EnableWebMvc
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "independent", useDefaultFilters = false, includeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})})*/
public class MvcConfigSupport extends WebMvcConfigurationSupport {

  @Bean
  public HttpMessageConverter<String> responseBodyConverter() {
    StringHttpMessageConverter converter = new StringHttpMessageConverter(
            Charset.forName("UTF-8"));
    return converter;
  }

  @Override
  public void configureMessageConverters(
          List<HttpMessageConverter<?>> converters) {
    super.configureMessageConverters(converters);
    converters.add(responseBodyConverter());
  }

  @Override
  public void configureContentNegotiation(
          ContentNegotiationConfigurer configurer) {
    configurer.favorPathExtension(false);
  }

}

