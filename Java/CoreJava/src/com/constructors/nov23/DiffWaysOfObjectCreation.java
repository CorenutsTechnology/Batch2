package com.constructors.nov23;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DiffWaysOfObjectCreation
{
	int value=10;
	private double r;
	
	public DiffWaysOfObjectCreation(double r) 
	{
		r=r;
	}
	public DiffWaysOfObjectCreation() {
		// TODO Auto-generated constructor stub
	}
	static void method(final int x)
	{
		
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		//using new keyword
		DiffWaysOfObjectCreation obj = new DiffWaysOfObjectCreation(10.0);
		System.out.println("vlaue: "+obj.value);
		
		//using class.newInstance() method
		DiffWaysOfObjectCreation obj2 = null;
		try {
			obj2 = DiffWaysOfObjectCreation.class.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("value: "+obj2.value );
		
		
		//using newInstance() method of constructor
		
		Constructor<DiffWaysOfObjectCreation> objCon=null;
		try {
			objCon = DiffWaysOfObjectCreation.class.getConstructor();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}  
		DiffWaysOfObjectCreation obj3=null;
		try {
			obj3 = objCon.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}  
		System.out.println(obj3.value);
		
		System.out.println(obj3.r);
	}
}
