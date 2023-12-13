package com.feujitest;

import com.feuji9nov.UnaryOperators;

public class UnaryOperatoeTest 
{
	UnaryOperators unaryoperator=new UnaryOperators();
	public void increementTest()
	{
		int result1=unaryoperator.increment(10, 11);
		System.out.println(result1);
	}
	public void decrementTest()
	{
		int result2=unaryoperator.decrement(5);
		System.out.println(result2);
	}
	public void notTest()
	{
		boolean res3=unaryoperator.not(10, 20);
		System.out.println(res3);
	}
	public static void main(String[] args)
	{
		UnaryOperatoeTest unaryTest=new UnaryOperatoeTest();
		unaryTest.increementTest();
		unaryTest.decrementTest();
		unaryTest.notTest();
		
	}

}
