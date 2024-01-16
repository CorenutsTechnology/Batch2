package com.spring.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
//@Component
public class Cart 
{
	@Autowired
	 private List<Product> product;
	@Value("1")
	 private int id;
	 public Cart()
	 {
		 
	 }
	 
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cart(List<Product> product, int id) {
		super();
		this.product = product;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cart [product=" + product + ", id=" + id + "]";
	}
	 

}
