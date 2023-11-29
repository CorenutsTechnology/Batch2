package com.cnuts.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import com.cnuts.operator.UnaryOperators;


public class UnaryTest {
	
	UnaryOperators unaryOperator=new UnaryOperators();
	
	@Test
	public void incrementTest() {
		unaryOperator.increment(10, 30);
		assertEquals(41, 41);
	}
	
	 
	 @Test
	 public void decrementTest() {
		unaryOperator.decrement(40, 16);
		 assertEquals(54, 54);
	 }
	
	@Test
	public void plusTest() {
		unaryOperator.plusUnary(10);
		assertEquals(10,10);
	}
	
	@Test
	public void minusTest() {
		unaryOperator.minusUnary(10);
		assertEquals(10 , 10);
	}
	
	@Test
	public void notEqualTest() {
		unaryOperator.notEqual(10);
		assertFalse( false);
	}
	
}
