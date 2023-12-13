package com.feuji9nov;

public class RelationalOperators {
	public  boolean lessThan(int value1,int value2)
	{
		
		return value1<value2;
	}
	
		public boolean greaterThan(int value1,int value2)
		{
			return value1>value2;
		}
	public boolean lessThanEqual(int value1,int value2)
	{
		boolean res=value1<=value2;
		System.out.println(res);
		return res;
	}
	public boolean greaterThanEqual(int value1,int value2)
	{
		boolean res1=value1>=value2;
		System.out.println(res1);
		return res1;
	}
	public boolean equal(int value1,int value2)
	{
		return value1==value2;
	}
	public boolean notEqual(int value1,int value2)
	{
		return value1!=value2;
		
	}

}
