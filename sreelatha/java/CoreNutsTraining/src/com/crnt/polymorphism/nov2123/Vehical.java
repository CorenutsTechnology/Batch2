package com.crnt.polymorphism.nov2123;

public class Vehical {
	public Vehical engine()
	{
		System.err.println("it is vehical engine ..");
		return null;
	}
	public Object engine(String type)
	{
		System.out.println("the type of the engine is "+type);
		return null;
	}
	public Object engine(int model)
	{
		System.out.println("The model of the engine is : "+model);
		return model;
	}
	public void engine(String performance,int speed)
	{
		System.out.println("The performance of the engine is "+performance+" and "
				+ "speed of the engine is :  "+speed);
	}

}
