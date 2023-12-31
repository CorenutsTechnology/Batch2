package com.generics.nov29;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T extends Comparable>
{
	private int n;
	private T name;
	private T type;
	
	public <T> void display( T obj1 , T obj2)
	{
		System.out.println(obj1+" "+obj2);
	}
	public  void display( T obj1 , T obj2)
	{
		System.out.println(obj1+" and "+obj2);
	}
	public static void main(String[] args) 
	{
		GenericClass<Integer> obj1 = new GenericClass<>();
		GenericClass<Double> obj2 = new GenericClass<>();
		obj1.<Integer>display(10,20);
		obj2.<Double>display(2.5,3.0);
//		obj1.display(new ArrayList() , new ArrayList());
//		GenericClass<GenericMethod> obj3 = new GenericClass<>();
		//if GenericMethod class is not implements the Comparable classs, it will throw error

	}
}
