package com.operators;

public class LogicalOperator {
	
	public void and(int value1,int value2)
	{
		boolean result=((value1>value2) && (value1++ <= 10));
		  System.out.println("And result= "+value1);
		  System.out.println("and result= "+result);
	}
	
	public void or(int value1,int value2)
	{
	  boolean result=((value1>value2) || (value1++ <= 10));
	  System.out.println("or result= "+value1);
	  System.out.println("or result= "+result);
	
	}
//	to differentiate & and &&
// if 1st condition is false and also it will check 2nd condition also
	public void differentiateSingleAnd(int value1,int value2)
	{
		  boolean result1=((value1>value2) & (value1++ <= 10));
		  System.out.println("And result= "+value1);
		  System.out.println("and result= "+result1);
		  
		  
	}
//	if 1st condition is false it wont checks for the 2nd condition
	public void differentiateDoubleAnd(int value1,int value2)
	{
		  boolean result2=((value1>value2) && (value1++ <= 10));
		  System.out.println("And result= "+value1);
		  System.out.println("and result= "+result2);
		
	}

	public static void main(String[] args) {
      
		LogicalOperator logicalOperator=new LogicalOperator();
		logicalOperator.and(10, 10);
		logicalOperator.or(10, 20);
		logicalOperator.differentiateSingleAnd(10, 20);
		logicalOperator.differentiateDoubleAnd(10, 20);

		
	}
	

}
