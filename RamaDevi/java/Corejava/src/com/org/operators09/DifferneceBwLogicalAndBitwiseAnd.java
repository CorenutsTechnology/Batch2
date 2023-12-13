package com.org.operators09;

public class DifferneceBwLogicalAndBitwiseAnd {
	public void bitwiseAnd(int value1,int value2)
	{
		if((value1++>value2++)&(value1<value2))
		{
		System.out.println(value1);
		System.out.println(value2);
	
		}
		else
		{
		System.out.println(value1);
		System.out.println(value2);
		}
	}

	public void logicalAnd(int value1,int value2)
	{
		if((value1>value2)&&(value1++<value2++))
		{
		System.out.println(value1);
		System.out.println(value2);
		}
		else
		{
		System.out.println(value1);
		System.out.println(value2);
		}
	}
	
}
