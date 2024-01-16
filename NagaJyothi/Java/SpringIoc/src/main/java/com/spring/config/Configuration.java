package com.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.spring.bean.Cart;
import com.spring.bean.Product;
import com.spring.db.DBConnection;
@Component
public class Configuration
{
	@Bean
	public Product createProduct()
	{
		return new Product();
	}
	@Bean
	public Cart createCart()
	{
		return new Cart();
	}
	@Value("${url}")
	String url;
	@Value("${uname}")
	String username;
	@Value("${password}")
	String password;
	@Bean
	public DBConnection getConnection()
	{
		return new DBConnection(url,username,password);
	}

}
