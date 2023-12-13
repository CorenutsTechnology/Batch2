package com.feuji22Nov;

public class TwoWheelarClass extends Vehicle
{
    Vehicle object;
	/*
	 * public TwoWheelarClass() {
	 * System.out.println("default constructor of two wheelar");
	 * 
	 * }
	 */
	public TwoWheelarClass(String type) {
		super(type);
		
	}
	public TwoWheelarClass(String type,Vehicle object)
	{
		this(type);
		this.object=object;
	}
	@Override
	public String toString() {
		return "TwoWheelarClass [object=" + object +  "]";
	}
	
	/*
	 * public void display() { System.out.println(type); }
	 */
	/*
	 * public TwoWheelarClass(String type, Bike b1) { // TODO Auto-generated
	 * constructor stub }
	 */
	

}
