package com.cnts.operator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LogicalTest4 {
	LogicalOperators LogicalOperators=new LogicalOperators();
	
	@BeforeEach
	public void Before() {
		System.out.println("before");
	}
	@Test
	public void and() {
		boolean result=LogicalOperators.andLogical(10, 20);
		assertTrue(result);
	
	
	}
	@Test
	public void or() {
		boolean result=LogicalOperators.orLogical(20, 10);
		assertFalse(result);
	
	
	}
	@Test
	public void not() {
		boolean result=LogicalOperators.notLogical(10, 20);
		assertFalse(result);
	
	
	}
	
	
	
	
	
		
		
	

}
