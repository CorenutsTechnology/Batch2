package com.crnt.operatorsnov0923;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AndOperatorTest {
	AndOperator andOperator= new AndOperator();
	@Test
	public void andOperatorTest()
	{
		boolean result = andOperator.andOpe(10, 100);
		System.out.println("And operator result : "+result);
		assertFalse(result);
	}
	

}
