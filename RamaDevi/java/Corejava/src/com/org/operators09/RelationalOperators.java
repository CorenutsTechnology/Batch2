package com.org.operators09;

public class RelationalOperators {

	public void lessthan(int value1,int value2)
	{
		boolean result=(value1<value2);
		System.out.println(result);
		
	}

	public void greaterthan(int value1,int value2)
	{
		boolean result=(value1>value2);
		System.out.println(result);
		
	}
	public void greaterthanOrEqualTo(int value1,int value2)
	{
		boolean result=(value1>=value2);
		System.out.println(result);
		 
	}
	public void lessthanOrEqualTo(int value1,int value2)
	{
		boolean result=(value1<=value2);
		System.out.println(result);
		 
	}
	public void isEqualTo(int value1,int value2)
	{
		boolean result=(value1==value2);
		System.out.println(result);
		
	}
	public void notEqualTo(int value1,int value2)
	{
		boolean result=(value1!=value2);
		System.out.println(result);
	
	}
}
