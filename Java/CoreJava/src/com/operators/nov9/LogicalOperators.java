//and or not
package com.operators.nov9;

public class LogicalOperators 
{
	boolean and(int value1 , int value2)
	{
		
		boolean result=((value1++ >value2) && (++value1== value2));
		System.out.println("and "+value1);
		System.out.println("and "+value2);
		return result;
	}
	
	boolean or(int value1 , int value2)
	{
		boolean result= ((++value1<value2) || (++value1 == value2));
		System.out.println("or "+value1);
		System.out.println("or "+value2);
		return result;
	}
	
	boolean not(int value1 , int value2)
	{
		return (!(value1>value2));
	}
}
