package com.exception_overriding.nov22;

import java.io.IOException;

public class SubClass4 extends SuperClass4
{

	@Override
	void show() throws ArithmeticException {
		System.out.println("sub class");
		super.show();
	}
	public static void main(String[] args) {
		SubClass4 obj = new SubClass4();
		obj.show();
		SuperClass4 obj2 = new SuperClass4();
		SuperClass4 obj3 = new SubClass4();
		obj2.show();
		obj3.show();
	}
}
