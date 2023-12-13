package com.feuji30nov;

public class Product <T> 
{
	T name;
	T price;
	public Product(T name, T price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getPrice() {
		return price;
	}

	public void setPrice(T price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	

}
