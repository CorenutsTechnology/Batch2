package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class ProductSpecialImplementation  implements ProductService
{

	@Override
	public void service() {
		System.out.println("special method");
		
	}
	

}
