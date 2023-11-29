package com.cnts.nov15;

public class ProtectedDefault
{
	int value1=38;   // default variable
	protected int value2 = 37;  // protected variable
	
	protected void display()     // protected method
	{
		System.out.println(value1-value2);
	}
	
	void display2()    // default method
	{
		System.out.println(value1*value2);
	}
	
}

/* 
 * as the class is default we cant access it outside the same package
 * but we can access the default class within the same package 
 * we cant declare a class as a protected
 * 
 * 
 * we can access the protected variable and protected method in another class of another package
 *  if this class is public but if this class is default then we cant
 * 
 * */
