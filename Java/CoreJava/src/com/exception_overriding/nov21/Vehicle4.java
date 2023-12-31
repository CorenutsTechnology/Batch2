package com.exception_overriding.nov21;

public class Vehicle4 
{
	Bike display(Vehicle4 v2 ) 
	{
		System.out.println("Vehicle");
		return (Bike) new Bike();
	}
}
