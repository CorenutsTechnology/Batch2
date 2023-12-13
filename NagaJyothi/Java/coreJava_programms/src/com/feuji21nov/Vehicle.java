package com.feuji21nov;

public class Vehicle 
{
	/*4th 
	 * public void type() { System.out.println("type of vehicle"); }
	 * 
	 */
	/*
	 * private void type() { System.out.println("type of vehicle"); }
	 * we will get error because we unable to access private members in another class.
	 */
	/*
	 * void type() { System.out.println("type of vehicle");// we can access in the
	 * same package. }
	 */
	protected  void type()
		{
			System.out.println("type of vehicle");// we can access in the same package.
		}

}
