package com.org.oop21;

public class Audi  extends Car{
	/*public void gears()
	{
		System.out.println("audi gears");
		
		
	}
	public void wheels()
	{
		System.out.println("wheels in audi");
		
	}*/

	public static void main(String[] args) {
	Audi audi=new Audi();
	audi.gears();
	audi.wheels();
	
	Car car=new Car();
	car.gears();
	car.wheels();

	}

}
