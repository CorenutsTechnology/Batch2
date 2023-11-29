package com.operators;

public class ArithmeticOperator {
	
	public void addition(int value1,int value2)
	{
		int result=(value1+value2);
		System.out.println("addition result= "+result);
	}
	public void substraction(int value1,int value2)
	{
		int result=(value1-value2);
		System.out.println("substraction result= "+result);
	}
	public void multiplication(int value1,int value2)
	{
		int result=(value1*value2);
		System.out.println("multiplication result= "+result);
	}
	public void division(int value1,int value2)
	{
		int result=(value1/value2);
		System.out.println("division result= "+result);
	}
	public void moduler(int value1,int value2)
	{
		int result=(value1%value2);
		System.out.println("moduler result= "+result);
	}
	public void  incrementAndDecrement(int value1)
	{
		value1++;
		System.out.println("postincrementresult= "+value1);
		value1--;
		System.out.println("postdecrementsresult= "+value1);
		++value1;
		System.out.println("preincrementresult= "+value1);
		--value1;
		System.out.println("predecrementresult= "+value1);
	}
	
	public static void main(String[] args) 
	{
		ArithmeticOperator arithmeticOperator=new ArithmeticOperator();
		arithmeticOperator.addition(10, 10);
		arithmeticOperator.substraction(20, 10);
		arithmeticOperator.multiplication(10, 10);
		arithmeticOperator.division(100, 10);
		arithmeticOperator.moduler(100, 10);
		arithmeticOperator.incrementAndDecrement(10);

	}
	
	

}
