package com.feuji.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.feuji")
@PropertySource(value = "amazon.properties")
public class AmazonConfiguration
{
//	@Autowired
//	@Qualifier(value = "specialService")
//	public ItemService itemService;
}
