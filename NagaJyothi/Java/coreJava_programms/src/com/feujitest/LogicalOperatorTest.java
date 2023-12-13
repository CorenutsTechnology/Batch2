package com.feujitest;

import com.feuji9nov.LogicalOperators;

public class LogicalOperatorTest
{
	LogicalOperators logicaloperators=new LogicalOperators();
	public void andTest()
	{
		boolean res1=logicaloperators.and(20, 10);
		System.out.println(res1);
	}
	public void orTest()
	{
		boolean res2=logicaloperators.or(20, 10);
		System.out.println(res2);
	}

	/*
	 * public void notTest() { boolean res3=logicaloperators.not(10, 20);
	 * System.out.println(res3); }
	 */
   public static void main(String[] args) 
   {
	   LogicalOperatorTest logicalTest =new LogicalOperatorTest();
	   logicalTest.andTest();
	   logicalTest.orTest();
	   //logicalTest.notTest();
	
}
}
