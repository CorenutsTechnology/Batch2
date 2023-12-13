package com.feuji21nov;

public class Audi extends Car
{
	
	public Car type()
	{
		System.out.println("Audi car");
		return new BMW();
	}

}
