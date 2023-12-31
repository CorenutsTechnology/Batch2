package com.exception_overriding.nov21;

public class TwoWheeler extends Vehicle4
{
	int b=25;
	@Override
	Bike display(Vehicle4 v2) {
		// TODO Auto-generated method stub
		return new Bike();
	}
	void display(Bike b2) 
	{
		System.out.println("Vehicle -- Twowheeler");
	}
}
