package com.feuji9nov;

public class UnaryOperators 
{
	public int increment(int value1,int value2)
	{
		return (value1++)+(++value2);
		
	}
	public int decrement(int value1)
	{
		//int dec=(value1--)+(--value1);
		return (value1--)+(--value1);
	}
	public boolean not(int value1,int value2)
	{
		//boolean res2=!((value1>value2))&&(value1++<=value2);
		System.out.println(value1);
		return !((value1>value2))&&(value1++<=value2);
	}
	

}
