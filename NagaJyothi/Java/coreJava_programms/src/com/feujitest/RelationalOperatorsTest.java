package com.feujitest;

import com.feuji9nov.RelationalOperators;

public class RelationalOperatorsTest
{
	RelationalOperators relational=new RelationalOperators();
	public void lessThanTest()
	{
		boolean res1=relational.lessThan(23, 25);
		System.out.println(res1);

	}
	public void greaterThanTest()
	{
		boolean res2=relational.greaterThan(5, 90);
		System.out.println(res2);
	}
	public void lessThanEqualTest()
	{
		boolean res3=relational.lessThanEqual(20, 10);
		
	}
	public void greaterThanEqualTest()
	{
		boolean res4=relational.greaterThanEqual(30, 5);
	}
	public void equal()
	{
		boolean res5=relational.equal(10, 10);
		System.out.println(res5);
	}
	public void notEqual()
	{
		boolean res6=relational.notEqual(10, 10);
		System.out.println(res6);
	}
	public static void main(String[] args) 
	{
		RelationalOperatorsTest relationalTest=new RelationalOperatorsTest();
		relationalTest.lessThanTest();
		relationalTest.greaterThanTest();
		relationalTest.lessThanEqualTest();
		relationalTest.greaterThanEqualTest();
		relationalTest.equal();
		relationalTest.notEqual();
		
		
	}

}
