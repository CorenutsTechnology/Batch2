package com.generic.nov28;

import java.io.Serializable;
import java.util.Stack;

public class Bound4 
{
//	public <T extends Serializable> void compare(T value1 , T value2)
//	{
//		System.out.println(value1);
//		System.out.println(value2);
//	}
	public <T extends Comparable> void compare(T value1 , T value2)
	{
		System.out.println(value1.compareTo(value2));
	}
	
	public static void main(String[] args) 
	{
		Bound4 bound1 = new Bound4();
//		bound1.compare(new GenericClass1(),new GenericClass1());
		
//		it will throw error because GenericClass1 is not sub class of Comparable ,this
//		is nothing but bounded type parameter
		
		bound1.compare("hello","hello");
		bound1.compare(10,20);
//		bound1.compare(new Stack() ,new Stack());
	}
}
