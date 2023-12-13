package com.feuji15nov;

public class AllAccessModifires
{
	public int value1=10;
	private int value2=20;
	String value3="jyothi";
	protected double value4=23.5;
	public void publicMethod()
	{
		System.out.println("value1 by using public method"+value1);
		System.out.println("value1 by using public method"+value2);
		System.out.println("value1 by using public method"+value3);
		System.out.println("value1 by using public method"+value4);
	}
	private void privateMethod()
	{
		System.out.println("value1 by using private method"+value1);
		System.out.println("value1 by using private method"+value2);
		System.out.println("value1 by using private method"+value3);
		System.out.println("value1 by using private method"+value4);
	}
	protected void protectedMethod()
	{
		System.out.println("value1 by using protected method"+value1);
		System.out.println("value1 by using protected method"+value2);
		System.out.println("value1 by using protected method"+value3);
		System.out.println("value1 by using protected method"+value4);
		
	}
	 void defaultMethod()
	{
		System.out.println("value1 by using default method"+value1);
		System.out.println("value1 by using default method"+value2);
		System.out.println("value1 by using default method"+value3);
		System.out.println("value1 by using default method"+value4);
	}

}
