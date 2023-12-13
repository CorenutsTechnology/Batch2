package com.feuji22Nov;

public class Vehicle 
{
	private String type;
	private int number;
	TwoWheelarClass object;
	
	public Vehicle(String type)
	{
		System.out.println(" vehicle constructor of String type!!!");
		this.type=type;
	}
	public Vehicle(String type,int number )
	{
		this(type);
		this.number=number;
	}
	public Vehicle(String type, TwoWheelarClass object)
	{
		this(type);
		this.object=object;
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public TwoWheelarClass getObject() {
		return object;
	}
	public void setObject(TwoWheelarClass object) {
		this.object = object;
	}
	/*
	 * @Override public String toString() { return "Vehicle [type=" + type +
	 * ", number=" + number + ", object=" + object + "]"; }
	 * 
	 */

}
