package com.exception_overriding.nov21;

public class SubClass extends SuperClass
{
	void display(int var1 ,int var2)
	{
		System.out.println("Sub Class , var1: "+var1+" var2: "+var2);
	}
//	static void display(int var1 ,int var2)
//	{
//		System.out.println("hi");
//	}
	public static void main(String[] args) 
	{
		SubClass obj = new SubClass();
		obj.display(10);
		obj.display(10,20);
	}
}
