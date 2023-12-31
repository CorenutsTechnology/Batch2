package com.feuji.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.feuji.service","com.feuji.repository"})
@Import(value = HibernateConfiguration.class)
public class TrainingConfig 
{

}
