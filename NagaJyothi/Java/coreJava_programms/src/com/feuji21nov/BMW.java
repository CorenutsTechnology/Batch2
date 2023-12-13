 package com.feuji21nov;

public class BMW extends Car
{
	public Car type()
	{
		System.out.println("BMW car..");
		return new Audi();//we are unable to return super class...
	}
	
	
public static void main(String[] args) 
{
	    Car result=new BMW();
	   // System.out.println(result);
	    Car bmw=result.type();
	    System.out.println(bmw);
		
		  Car res=new Audi(); 
		Car audi = res.type();
		System.out.println(audi);
		 
}
}
