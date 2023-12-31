package com.exception_overriding.nov21;

public class Test4 
{
	public static void main(String[] args) 
	{
		Vehicle4 v1 = new Car();
		v1.display(v1);//sub class
		
		Vehicle4 v2 = new Bike();
		v2.display(v2);
		
		Bike b1 = new Bike();
//		System.out.println("callling 4whlr");
//		FourWheeler c1=  new FourWheeler();
//		c1.display(v2);
//		Car c1=  (Car) new Vehicle4();
//		c1.display();
		
	//	TwoWheeler b1 = new Car();
	}
}
