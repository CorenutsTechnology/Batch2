package com.exception_overriding.nov22;

import java.io.IOException;

public class SubClass3 extends SuperClass3 {

	@Override
	 void show() throws  RuntimeException
	{
		System.out.println("sub class");
//		super.show();
	}
	public static void main(String[] args) throws IOException  {
		SuperClass3 obj = new SubClass3();
		obj.show();
		SubClass3 obj2 = new SubClass3();
		obj2.show();
	}
}
