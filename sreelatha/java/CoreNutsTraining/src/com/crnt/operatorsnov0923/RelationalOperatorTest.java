package com.crnt.operatorsnov0923;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RelationalOperatorTest {
	
	RelationalOperator relationalOperator= new RelationalOperator();
	@Test
	public void lessThanTest()
	{
		boolean result = relationalOperator.lessThan(10, 100);
		System.out.println("less than test case : "+result);
		assertTrue(result);
	}
	@Test
	public void greaterThanTest()
	{
		boolean result = relationalOperator.greaterThan(10, 100);
		System.out.println("greater than test case : "+result);
		assertFalse(result);
	}
	@Test
	public void greaterThanEqualTest()
	{
		boolean result = relationalOperator.greaterThanEqual(10, 100);
		System.out.println("greater than  equal test case : "+result);
		assertFalse(result);
	}
	@Test
	public void lessThanEqualTest()
	{
		boolean result = relationalOperator.lessThanEqual(10, 100);
		System.out.println("less than equal test case : "+result);
		assertTrue(result);
	}
	@Test
	public void notEqualToTest()
	{
		boolean result = relationalOperator.notEqualTo(10, 100);
		System.out.println("not equal test case : "+result);
		assertTrue(result);
	}
	@Test
	public void equalTo()
	{
		boolean result = relationalOperator.equalTo(10, 100);
		System.out.println("equal to operator result : "+result);
		assertFalse(result);
		
	}
}
