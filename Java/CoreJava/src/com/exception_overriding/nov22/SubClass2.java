package com.exception_overriding.nov22;

public class SubClass2 extends SuperClass2
{
	void test() throws ArithmeticException
	{
		System.out.println("sub class");
	}
	public static void main(String[] args)  {
		SuperClass2 obj = new SubClass2();
		obj.test();
		
	}

}