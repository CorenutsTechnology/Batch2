package com.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value="service")

public class ProductServiceImplementation implements ProductService 
{

	@Override
	public void service() {
		System.out.println("service");
		
	}
	

}
