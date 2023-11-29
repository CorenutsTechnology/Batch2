package com.cnts.operator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UniaryTest2 {
	UniaryOperator UniaryOperator=new UniaryOperator();
	@BeforeEach
	public void Before() {
		System.out.println("before");
	}
	@Test
	public void PostIncrementTest() {
		int result=UniaryOperator.PostIncrement(10);
		assertEquals(11, result);
	}
	@Test
	public void PreIncrementTest() {
		int result=UniaryOperator.PreIncrement(10);
		assertEquals(11, result);
	}
	@Test
	public void Postdecrement() {
		int result=UniaryOperator.Postdecrement(10);
		assertEquals(8, result);
	}
	@Test
	public void Predecrement() {
		int result=UniaryOperator.Predecrement(10);
		assertEquals(8, result);
	}
	
	
		
		
	

}
