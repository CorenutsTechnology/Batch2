package com.operators;

public class RelationalOperator {
	
	public void greaterThan(int value1,int value2)
	{
		boolean result=(value1>value2);
		if(result)
		{
			System.out.println(value1+" greater than "+value2);
		}
		else
		{
			System.out.println(value1+" less than "+value2);

		}
		
	}
	
	public void lesserThan(int value1,int value2)
	{
		boolean result=(value1<value2);
		if(result)
		{
			System.out.println(value1+" lesser than "+value2);
		}
		else
		{
			System.out.println(value1+" greater than "+value2);

		}
		
	}

	public void greaterThanOrEquals(int value1,int value2)
	{
		boolean result=(value1>=value2);
		if(result)
		{
			System.out.println(value1+" greater than or equals to "+value2);
		}
		else
		{
			System.out.println(value1+" less than or equals to "+value2);

		}
		
	}
	public void lessThanOrEquals(int value1,int value2)
	{
		boolean result=(value1<=value2);
		if(result)
		{
			System.out.println(value1+" less than or equals to "+value2);
		}
		else
		{
			System.out.println(value1+" greater than or equals to "+value2);

		}
		
	}

	public void equalsTwoValues(int value1,int value2)
	{
		boolean result=(value1==value2);
		if(result)
		{
			System.out.println(value1+" equals to "+value2);
		}
		else
		{
			System.out.println(value1+" equals to "+value2);

		}
		
	}
	
	public void notEquals(int value1,int value2)
	{
		boolean result=(value1!=value2);
		if(result)
		{
			System.out.println(value1+" is not equals to "+value2);
		}
		else
		{
			System.out.println(value1+" is not equals to "+value2);

		}
		
	}
      
	public static void main(String[] args) 
	{
		RelationalOperator operator=new RelationalOperator();
		operator.greaterThan(10, 20);
		operator.lesserThan(10, 20);
		operator.greaterThanOrEquals(10, 10);
		operator.lessThanOrEquals(10, 20);
		operator.equalsTwoValues(10,10);
		operator.notEquals(10, 20);
        
	}

}
