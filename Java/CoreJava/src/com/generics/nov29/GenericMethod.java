package com.generics.nov29;

public class GenericMethod //implements Comparable 
{
	public <T> void method1(T a , T b)
	{
		
	}
	
	public static void main(String[] args) 
	{
		GenericMethod obj = new GenericMethod();
		obj.<Double>method1(new Double(10),new Double(20));
	}
}
