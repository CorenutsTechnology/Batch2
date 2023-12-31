package com.exception_overriding.nov21;

public class FourWheeler extends Vehicle4
{
	
	Bike display(Object v2) {
		System.out.println("vehicle -- four wheeler");
		return new Bike();
	}
}
