package com.exception_overriding.nov22;

public class SubClass extends SuperClass
{
	
	
	@Override
	void test() // throws ClassNotFoundException 
	{
		System.out.println("hello");
	}

	public static void main(String[] args)  {
		SuperClass obj = new SubClass();
		obj.test();
	}

}
