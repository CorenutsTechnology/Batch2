package com.crnts.operators;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class UnaryOperatorTest {
	UnaryOperator unaryOperator= new UnaryOperator();
	@Test 
	public void preIncrement()
	{
		int result=unaryOperator.preIncrement(1, 5);
		 System.out.println("preIncrement: "+ result);
	}
	@Test
	public void postIncrement()
	{
		int result=unaryOperator.postIncrement(10, 5);
		 System.out.println( "postIncrement: "+result);
	}
	@Test
	public void preDecrement()
	{
		int result=unaryOperator.preDecrement(10, 5);
		 System.out.println("preDecrement: "+result);
	}
	@Test
	public void postDecrement()
	{
		int result=unaryOperator.postDecrement(10, 5);
		 System.out.println("postDecrement: "+result);
	}
}
