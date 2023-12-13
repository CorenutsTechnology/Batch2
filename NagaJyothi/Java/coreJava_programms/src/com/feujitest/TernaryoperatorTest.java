package com.feujitest;

import com.feuji9nov.TernaryOperator;

public class TernaryoperatorTest 
{
	public void ternartTest()
	{
		TernaryOperator ternaryoperator=new TernaryOperator();
		String output=ternaryoperator.eligibility(17);
		System.out.println(output);
	}
	public static void main(String[] args) 
	{
		TernaryoperatorTest ternaryTest=new TernaryoperatorTest();
		ternaryTest.ternartTest();
		
		
	}

}
