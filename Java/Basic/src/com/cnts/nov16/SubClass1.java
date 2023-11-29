package com.cnts.nov16;

public class SubClass1 implements Calculate1
{

	@Override
	public void addition(int value1, int value2) {
		System.out.println(value1+value2);
	}

	@Override
	public void multiplication(int value1, int value2) {
		System.out.println(value1*value2);
	}

	@Override
	public void division(double value1, double value2) {
		System.out.println(value1/value2);
	}

	@Override
	public void substraction(int value1, int value2) {
		if(value1>value2)
		{
			System.out.println(value1-value2);
		}
		else
			System.out.println(value2-value1);
	}

}
