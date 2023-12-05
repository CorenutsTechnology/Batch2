package com.crnts.operators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LogicalTest {
	LogicalOperators logicalOperators =new LogicalOperators();
	@Test 
	public void and()
	{
		boolean result=logicalOperators.logicalAnd(10, 5);
		assertTrue(result);
	}
	
	@Test 
	public void or()
	{
		boolean result=logicalOperators.logicalOr(10, 5);
		assertTrue(result);
	}
	@Test 
	public void not()
	{
		boolean result=logicalOperators.logicalNot(100, 15);
		System.out.println(result);
		assertFalse(result);
	}

}
