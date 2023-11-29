package com.cnts.basic;

public class Vehicle 
{
	String name="Hero";
	double price=75000;
	String color="gold";
	
	public void detail()
	{
		System.out.println("Parent Class");
		System.out.println("Brand Name: "+this.name);
		System.out.println("Price: "+this.price);
		System.out.println("Color: "+this.color);
	}
}

