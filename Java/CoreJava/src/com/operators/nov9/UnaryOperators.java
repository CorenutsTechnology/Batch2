package com.operators.nov9;

public class UnaryOperators 
{
	public int increment(int value1, int value2)
	{
		int result = (value1++ + ++value2);
		System.out.println(value1);
		System.out.println(value2);
		return result;
	}

	public int decrement(int value1, int value2) 
	{
		int result = (value1-- + --value2);
		System.out.println(value1);
		System.out.println(value2);
		return result;
	}
}
