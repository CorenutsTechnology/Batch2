package com.crnts.operators;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AndOperatorTest {
	AndOperators andOperators=new AndOperators();
	@Test	
	public void additionTest() {
		boolean result=andOperators.And(15, 5);
		System.out.println(result);
		assertTrue(result);
		
	}	
	@Test	
	public void additionTest1() {
		boolean result=andOperators.And1(15, 5);
		
		assertTrue(result);
		
	}	
}
