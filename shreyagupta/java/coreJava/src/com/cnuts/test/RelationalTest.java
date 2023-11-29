package com.cnuts.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.cnuts.operator.RelationalOperators;

public class RelationalTest {
	
	RelationalOperators relationalOperatator = new RelationalOperators();
	 
	@Test
	public void equalToTest() {
		relationalOperatator.equalTo(15, 17);
		assertFalse(false);
		
	}
	
	@Test
	public void notEqualToTest() {
		relationalOperatator.notEqualTo(17, 18);
		assertTrue(true);
	}
	
	@Test
	public void greaterThanTest() {
		relationalOperatator.greaterThan('h','i');
		assertFalse(false);
	}
	
	@Test
	public void lessThanTest() {
		relationalOperatator.lessThan(79, 29);
		assertFalse(false);
	}
	
	@Test
	public void greaterThanEqualToTest() {
		relationalOperatator.greaterThanEqualsTo(10, 10);
		assertTrue(true);
	}
	
	@Test
	public void lessThanEqualToTest() {
		relationalOperatator.lessThanEqualsTo(67,87);
		assertFalse(false);
	}
	
	
	
	
	
	

}
