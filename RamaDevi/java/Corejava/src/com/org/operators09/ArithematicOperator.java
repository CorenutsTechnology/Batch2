package com.org.operators09;

public class ArithematicOperator {
	public int addition(int value1,int value2)
	{
		int result=value1+value2;
		System.out.println(result);
		return result;
	}
	
	public int substraction(int value1,int value2)
	{
		int result=value1-value2;
		System.out.println(result);
		return result;
	}
	public int multiplication(int value1,int value2)
	{
		int result=value1*value2;
		System.out.println(result);
		return result;
	}
	public double division(int value1,double value2)
	{
		double result=value1/value2;
		System.out.println(result);
		return result;
	}
	public double moduloDivision(double value1,int value2)
	{
		double result=value1%value2;
		System.out.println(result);
		return result;
	}
}
