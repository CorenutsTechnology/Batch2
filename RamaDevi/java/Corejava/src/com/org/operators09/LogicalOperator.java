package com.org.operators09;

public class LogicalOperator {

	public void logicalAnd(int value1,int value2)
	{
		boolean result=(value1+2>value2)&&(++value1!=value2++);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(result);
		
	}
	public void logicalOr(int value1,int value2)
	{
		boolean result=(value1+4>value2--)||(value1<value2);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(result);
		
	}
	public void logicalNot(int value1,int value2)
	{
		boolean result=!(value1>=value2);
		System.out.println(result);
		
	}
}
