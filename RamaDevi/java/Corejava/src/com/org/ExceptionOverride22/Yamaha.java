package com.org.ExceptionOverride22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Yamaha extends Bike{

	public void ride() 
	{
		
		System.out.println("ride in yamaha");
		//FileInputStream fileInputStream = new FileInputStream("d:deskop\\feuji");
	}
	public void color()
	{
		System.out.println("color in yamaha");
	}
	public static void main(String[] args) {
		Yamaha yamaha=new Yamaha();
		yamaha.ride();
		//yamaha.color();
		
	}

}
