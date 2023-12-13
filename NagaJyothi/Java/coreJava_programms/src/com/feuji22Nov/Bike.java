package com.feuji22Nov;

public class Bike extends TwoWheelarClass
{
	int wheels;
	/*
	 * public Bike() { System.out.println("Default constructor od Bike"); }
	 */
	public Bike(String type)
	{
		super(type);
		System.out.println(" Bike constructor using string type");
		
	}
	public Bike(String type, int wheels) {
		super(type);
		this.wheels = wheels;
	}
	@Override
	public String toString() {
		return "Bike [wheels=" + wheels + "]";
	}
	
	
	/*
	 * public Bike(String string, TwoWheelarClass object) {
	 * System.out.println("Default constructor of Bike"); }
	 */
	
	

}
 