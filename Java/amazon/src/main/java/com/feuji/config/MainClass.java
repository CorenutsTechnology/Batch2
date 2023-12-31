package com.feuji.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.feuji.bean.Cart;
import com.feuji.bean.Item;
import com.feuji.bean.LoadConfig;
import com.feuji.service.DbConnection;
import com.feuji.service.DbConnection2;

public class MainClass
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AmazonConfiguration.class);
		
		LoadConfig loadConfig = applicationContext.getBean(LoadConfig.class);
		
		System.out.println(loadConfig);
		
		Item item = loadConfig.getItem();
		Cart cart = loadConfig.getCart();
		
		System.out.println(item);
		System.out.println(cart);
		
		//accessing values from properties file , using annotations
		System.out.println("accessing values from properties file , using annotations");
		DbConnection connection = applicationContext.getBean(DbConnection.class);
		System.out.println(connection);
		System.out.println(connection.getConnection());
		System.out.println(connection.getUrl());
		System.out.println(connection.get_username());
		System.out.println(connection.getPassword());
		
		//accessing values from properties file , using xml configuration
		System.out.println("accessing values from properties file , using xml configuration");
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
		DbConnection2 bean = (DbConnection2) classPathXmlApplicationContext.getBean("connection");
		System.out.println(bean.getUrl());
		System.out.println(bean.getUsername());
		System.out.println(bean.getPassword());
		
		
	}
}
