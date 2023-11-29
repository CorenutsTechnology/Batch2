package com.cnts.nov21;

 class Car {
	// Rule 1: Method in the base class
	void start()
	{
		System.out.println("Car starts");
	}
}

class BMW extends Car
{
	// Rule 2: Overriding the method in the derived class
	@Override
	void start() {
		System.out.println("BMW car starts");
	}
}

class Sedan extends Car
{
	// Rule 2: Overriding the method in the derived class
//	@Override
	void start() {
		System.out.println("Sedan car starts");
	}
}


public class Main4
{
	public static void main(String[] args) {
		Car car = new BMW();        // Upcasting
		Car car2 = new Sedan();     // Upcasting
		
		//Rule 3: Call to overridden methods
		car.start();
		car2.start();
	}
}

