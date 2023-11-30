package day_09_11_23Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import day_09_11_23_Assignment.LogicalOperators;

public class LogicalOperatorsTest {
	
	LogicalOperators logical=new LogicalOperators();
	
	@Test
	public void andTest() {
		boolean result=logical.and(12, 16);
		assertFalse(result);
	}
	
	@Test
	public void andTest1() {
		boolean result=logical.and1(16, 17);
		assertFalse(result);
	}
	
	@Test
	public void andTest2() {
		boolean result=logical.and2(6, 9);
		assertTrue(result);
	}
	
	@Test
	public void orTest() {
		boolean result=logical.or(12, 16);
		assertTrue(result);
	}
	
	@Test
	public void orTest1() {
		boolean result=logical.or1(16, 21);
		assertTrue(result);
	}
	
	@Test
	public void orTest2() {
		boolean result=logical.or2(6, 9);
		assertTrue(result);
	}
	
	@Test
	public void notTest() {
		boolean result=logical.not(21, 6);
		assertTrue(result);
	}
}
