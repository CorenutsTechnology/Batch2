package com.cnts.nov15;

public class vehicle 
{
	String brand, color;
	double price;
	
	
 void max_speed(int speed)
	{
		if(speed==40)
			System.out.println("Max_speed is 90kmph");
		if(speed==30)
			System.out.println("Max- speed is 80kmph");
	}
 
 public static void main(String[] args) {
//	 by instence
	vehicle vehicle = new vehicle();
	System.out.println(vehicle.brand);
	System.out.println(vehicle.color);
	System.out.println(vehicle.price);
}
}
