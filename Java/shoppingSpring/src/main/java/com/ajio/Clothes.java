package com.ajio;

import org.springframework.stereotype.Component;

@Component
public class Clothes
{
	private String brandname;
	private double price;
	public Clothes(String brandname, double price) {
		super();
		this.brandname = brandname;
		this.price = price;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Clothes [brandname=" + brandname + ", price=" + price + "]";
	}
	
	
}
