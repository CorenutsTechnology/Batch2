package com.spring.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.spring"})
@PropertySource("classpath:db.properties")
public class ConfigAnnotation 
{


}
