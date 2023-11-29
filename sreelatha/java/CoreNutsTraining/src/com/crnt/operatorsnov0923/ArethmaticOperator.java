package com.crnt.operatorsnov0923;

public class ArethmaticOperator {
	public int addition(int value1, int value2)
	{
		int result = (value1+value2)+100;
		return result;
	}
	public int subtraction(int value1, int value2)
	{
		int result = (value1-value2)+100;
		return result;
	}
	public int multiplication(int value1, int value2)
	{
		int result = (value1*value2)+100;
		return result;
	}
	public double division(double value1, int value2)
	{
		double result =  (value1/value2);
		return result;
	}
	public int modulus(int value1, int value2)
	{
		int result = (value1%value2);
		return result;
	}
	public int increment(int value1, int value2)
	{
		int result = ((value1++) + value2)+(--value1);
		System.out.println("value1 : "+value1);
		return result;
	}
	public int decrement(int value1, int value2)
	{
		int result = (--value1);
		System.out.println("value1 in dec : "+value1);
		return result;
	}
	



}
