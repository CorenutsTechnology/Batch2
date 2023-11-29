package com.crnt.operatorsnov0923;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TernaryOperatorTest {
	TernaryOperator ternaryOperator = new TernaryOperator();
	@Test
	public void ternaryTest()
	
	{
		String result = ternaryOperator.ternary(10, 100);
		System.out.println("ternary test result : "+result);
		assertEquals("greater" , result);
		
	}

}
