package com.crnt.operatorsnov0923;

public class RelationalOperator {
	
	
	public boolean lessThan(int value1 ,int  value2 )
	{
		boolean result = value1<value2;
		return result;
	}
	public boolean greaterThan(int value1 ,int  value2 )
	{
		boolean result = value1>value2;
		return result;
	}
	public boolean lessThanEqual(int value1 ,int  value2 )
	{
		boolean result = value1<=value2;
		return result;
	}
	public boolean greaterThanEqual(int value1 ,int  value2 )
	{
		boolean result = value1>=value2;
		return result;
	}
	public boolean notEqualTo(int value1 ,int  value2 )
	{
		boolean result = (value1!=value2);
		return result;
	}
	public boolean equalTo(int value1 , int value2)
	{
		boolean result = (value1==value2);
		return result;
	}
	


}
