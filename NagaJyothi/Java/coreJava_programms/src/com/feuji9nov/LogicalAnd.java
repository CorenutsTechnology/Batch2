package com.feuji9nov;

public class LogicalAnd 
{
	public static void main(String[] args) 
	{
		int value1=10;
		int value2=20;
		int value3=30;
		if((value1<20)&&(value2++>10))
				{
			System.out.println(value2++);
				}
		else
		{
			System.out.println(value2++);
		}
		if((value2<20)&(value2++>10))
			System.out.println(value3);
		else
		{
			System.out.println(value2);
		}
	}

}
