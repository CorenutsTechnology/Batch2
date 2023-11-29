package com.cnts.nov9Operaters;

public class ArithmeticOperators
{
	public int addition(int value1,int value2)
	{
		int result = ((value1 + value2) + value2-50);
		System.out.println("Addition result is:"+result);
		return result;
	}
	
	public int substraction(int value1,int value2)
	{
		int result = ((value1 - value2) + value1-50);
		System.out.println("Substraction result is:"+result);
		return result;
	}
	
	public double multiplication(int value1,int value2)
	{
		double result = (value1*value2)+value1;
		System.out.println("Multiplication:"+result);
		return result;
	}
	
	public double division(int value1,double value2)
	{
		double result = value1/value2;
		System.out.println("Division:"+result);
		return result;
	}
	
	public double moduler(int value1,float value2)
	{
		double result = value1%value2;
		System.out.println("Reminder: "+result);
		return result;
	}
	
}

