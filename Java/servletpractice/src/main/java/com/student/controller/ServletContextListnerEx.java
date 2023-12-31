package com.student.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionListener;

public class ServletContextListnerEx implements ServletContextListener 
{
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		//this method will execute  whenever server starts
		System.out.println("contextInitialized ");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce)
	{
		//this method will execute  whenever server ends
		
		System.out.println("contextDestroyed ");
	
	}
}
