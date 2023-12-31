//5.Write a program to initialize static variables through constructor and print them?
package com.constructors.nov23;

public class Product5 
{
	{
		System.out.println("static block");
		name="lilli";
		price=100;
	}
	static String name;
	static double price;
	
	public Product5(String name, double price)
	{
		Product5.name=name;
		this.price=price;
	}
	void display()
	{
		System.out.println("name: "+name+" price: "+price);
	}
	public static void main(String[] args) 
	{
		Product5 product1 = new Product5("Parle-G" , 10.0);
		product1.display();
		Product5 product2 = new Product5("DairyMilk" , 20.0);
		product2.display();
	}

}
