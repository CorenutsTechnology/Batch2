package com.cnts.operator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RelationalTest3 {
	RelationalOperator RelationalOperator=new RelationalOperator();
	@BeforeEach
	public void Before() {
		System.out.println("before");
	}
	@Test
	public void lessThan() {
		boolean result=RelationalOperator.lessThan(20, 10);
		assertFalse(result);
	}
	@Test
	public void greterThan() {
		boolean result=RelationalOperator.greterThan(10, 20);
		assertTrue(result);
	}
	@Test
	public void greterThanareEqualto() {
		boolean result=RelationalOperator.greterThanAreEqualto(20, 10);
		assertTrue(result);
	}
	@Test
	public void lessThanThanareEqualto() {
		boolean result=RelationalOperator.lessThanAreEqualto(10, 20);
		assertFalse(result);
	}
	@Test
	public void notEquls() {
		boolean result=RelationalOperator.notEquls(10, 20);
		assertTrue(result);
	}
	
	
	
		
		
	

}
