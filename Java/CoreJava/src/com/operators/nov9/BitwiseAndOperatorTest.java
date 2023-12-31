package com.operators.nov9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class BitwiseAndOperatorTest 
{
	BitwiseAndOperator bitwiseAndOperator = new BitwiseAndOperator();
	@Test
	void bitwiseAndOperatorTest()
	{
		int result = bitwiseAndOperator.bitwiseOperator(4,5);
		assertEquals(4,result);
	}
	
	@Test
	void logicalOperatorTest()
	{
		boolean result=bitwiseAndOperator.logicalOperator(20,20);
		assertFalse(result);
	}
}
