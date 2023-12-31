package com.ajio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.ConfigAno;

public class Service
{
	public static void main(String[] args)
	{
		System.out.println("hello");
		/*
		 * ApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("application2.xml");
		 */
		ApplicationContext context= new AnnotationConfigApplicationContext(ConfigAno.class);
		
		System.out.println("hello2");
		Clothes clothes = context.getBean(Clothes.class);
		System.out.println(clothes);
		
	}
}
