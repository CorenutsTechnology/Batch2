package com.org.ExceptionOverride22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Car extends Vehicle {
	@Override
	public Car drive() throws  FileNotFoundException   {

		System.out.println("start");
		FileInputStream fileInputStream = new FileInputStream("d:deskop\\feuji");
		System.out.println("Car drive");
		return new Car();

}

//	public void feul()throws ArithmeticException
//	{
//
//		int result = 20 / 10;
//		//throw new ArithmeticException();
//		 System.out.println("feul in car");
//
//
//	}
	public static void main(String[] args) throws FileNotFoundException  {
		Car car = new Car();
		//car.feul();
		car.drive();
	}

}
