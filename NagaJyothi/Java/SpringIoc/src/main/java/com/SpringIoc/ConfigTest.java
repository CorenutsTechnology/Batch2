package com.SpringIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.ConfigAnnotation;
import com.spring.bean.Cart;
import com.spring.bean.Product;
import com.spring.db.DBConnection;
import com.spring.service.ProductService;
import com.spring.service.ProductServiceImplementation;

public class ConfigTest 
{
	public static void main(String[] args) 
	{
//		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigAnnotation.class);
		Product p1=context.getBean(Product.class);
		p1.setPrice(30000.0);
		System.out.println(p1);
		Cart c1=context.getBean(Cart.class);
		System.out.println(c1);
		//ProductService service=new ProductServiceImplementation();
		ProductService service=(ProductService) context.getBean("service");
		service.service();
		System.out.println();
//		ProductService service=context.getBean(ProductService.class);
//		System.out.println(service);
		 DBConnection connection=context.getBean(DBConnection.class);
		 System.out.println(connection.getConnection());
	}

}
