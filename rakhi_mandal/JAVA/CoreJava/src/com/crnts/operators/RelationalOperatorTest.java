package com.crnts.operators;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RelationalOperatorTest {
	RelationalOperator relationalOperator= new RelationalOperator();
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("Before Each");
	}
	@Test 
	public void smaller()
	{
		boolean result=relationalOperator.smaller(10, 5);
		 System.out.println(result);
		assertFalse(result);
	}
	
	@Test 
	public void greater()
	{
		boolean result=relationalOperator.greater(10, 5);
		 System.out.println(result);
		assertTrue(result);
	}
	@Test 
	public void smallerEquals()
	{
		boolean result=relationalOperator.smallerequal(10, 5);
		 System.out.println(result);
		assertFalse(result);
	}
	
	@Test 
	public void greaterEquals()
	{
		boolean result=relationalOperator.greaterequal(10, 5);
		 System.out.println(result);
		assertTrue(result);
	}
	@Test 
	public void doubleEquals()
	{
		boolean result=relationalOperator.doubleequal(10, 10);
		 System.out.println(result);
		assertTrue(result);
	}
	
	
}
