package com.feuji.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.feuji.config.TrainingConfig;
import com.feuji.entity.TrainingEntity;
import com.feuji.service.TrainingService;

public class TrainingTest
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TrainingConfig.class);
		TrainingService trainingService = context.getBean(TrainingService.class);
		
		TrainingEntity entity = new TrainingEntity();
		entity.setName("Java");
		entity.setFees(1000.0);
		
		trainingService.save(entity);
	}
}
