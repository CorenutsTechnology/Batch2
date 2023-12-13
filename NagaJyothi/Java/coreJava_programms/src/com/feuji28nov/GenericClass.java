package com.feuji28nov;

public class GenericClass 
{
	/*
	 * private int age; private String name;
	 */
	//methods as generic ,class as not generic
	public<T> void caluclate(T value1,T value2)
	{
		System.out.println("Value:"+value1+"value2:"+value2);
		
	}
	public <T extends Comparable<String>>void  compare(T value1,T value2)
	{
		System.out.println("value:"+value1);
		System.out.println("value2:"+value2);
		
	}
	public <T extends Comparable<T>>void  compare(Genaric<T> value1,T value2)
	{
		System.out.println("value:"+value1);
		System.out.println("value2:"+value2);
		
	}
	public <T extends Number>void display( T value,T value2)
	{
		
	}
	public static void main(String[] args) 
	{
		GenericClass generic=new GenericClass();
		Genaric<Double> result=new Genaric<>();
		//generic.caluclate(10, 20);
		generic.caluclate("Jyothi", 20);	
		generic.<Double>caluclate(30.0, 50.0);
		//GenericClass<Integer>result=new GenericClass();
		generic.compare("Jyothi", "jyothi");
		//generic.compare(10, 20);
		//generic.<Integer>compare( result, 10);
		generic.<Double>compare(result, 22.3);
		generic.display(10, 20);
		generic .display(22.5, 44.90);
		
		
	}

}
