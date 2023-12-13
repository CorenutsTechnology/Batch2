package com.feuji9nov;

public class LogicalOperators 
{
	public boolean and(int value1,int value2)
	{
		boolean res=(value1<value2)&&(value1++<=value1);
		System.out.println("value1="+value1);
		return res;
		
	}
	public boolean or(int value1,int value2)
	{
		boolean res1=(value1>value2)||(++value1<=value2);
		System.out.println(value1);
		return res1;
	}
	/*
	 * public boolean not(int value1,int value2) { //boolean
	 * res2=!((value1>value2))&&(value1++<=value2); System.out.println(value1);
	 * return !((value1>value2))&&(value1++<=value2); }
	 */

}
