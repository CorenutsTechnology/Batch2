package com.exception_overriding.nov22;

import java.io.IOException;

public class SubClass5 extends SuperClass5
{	
	@Override
	void show() 
	{
		System.out.println("sub class");
	}

	public static void main(String[] args) throws IOException 
	{
		SubClass5 obj = new SubClass5();
		obj.show();
		SuperClass5 obj2 = new SuperClass5();
		SuperClass5 obj3 = new SubClass5();
		obj2.show();
		obj3.show();
	}
}
