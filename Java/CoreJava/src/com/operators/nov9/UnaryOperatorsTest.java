package com.operators.nov9;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class UnaryOperatorsTest 
{
	UnaryOperators unaryOperators = new UnaryOperators();
	@Test
	public void incrementTest()
	{
		int result = unaryOperators.increment(10,20);
		System.out.println("increment result: "+result);
		assertEquals(31,result);
	}
	
	@Test
	public void decrementTest()
	{
		int result = unaryOperators.decrement(10,20);
		System.out.println("decrement result: "+result);
		assertEquals(29,result);
	}
}
