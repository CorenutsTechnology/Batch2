package com.feuji11dec;

import java.util.function.Function;
import java.util.function.Supplier;

public class CarClass 
{
	public static void main(String[] args) {
		 //Car car=new Car();
		//CarClass cl=Car::carType;
		Supplier<String>s=Car::carType; 
		s.get();
	}

}
