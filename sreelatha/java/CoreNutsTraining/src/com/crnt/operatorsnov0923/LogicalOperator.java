package com.crnt.operatorsnov0923;

public class LogicalOperator {
	public boolean andOperator(int value1 , int value2)
	{
	boolean result = ((value1<value2)&& (value2>value2));
		return result;
	}
	public boolean orOperator(int value1 , int value2)
	{
	boolean result = ((value1<value2)|| (value2>value2));
		return result;
	}

}
