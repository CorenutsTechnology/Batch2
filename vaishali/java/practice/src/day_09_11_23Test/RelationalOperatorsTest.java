package day_09_11_23Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import day_09_11_23_Assignment.RelationalOperators;

public class RelationalOperatorsTest {
	
	RelationalOperators relational=new RelationalOperators();
	
	@Test
	public void lessTest() {
		boolean result=relational.less(12, 8);
		System.out.println(" < operator result : "+result);
		assertFalse(result);
	}
	
	@Test
	public void lessThanOrEqualTest() {
		boolean result=relational.lessThanOrEqual(6, 18);
		System.out.println(" <= operator result : "+result);
		assertTrue(result);
	}
	
	@Test
	public void greaterTest() {
		boolean result=relational.greater(12, 8);
		System.out.println(" > operator result : "+result);
		assertTrue(result);
	}
	
	@Test
	public void greaterThanOrEqualTest() {
		boolean result=relational.greaterThanOrEqual(6, 18);
		System.out.println(" >= operator result : "+result);
		assertFalse(result);
	}
	
	@Test
	public void equalTest() {
		boolean result=relational.equal(12, 8);
		System.out.println(" == operator result : "+result);
		assertFalse(result);
	}
	
	@Test
	public void notEqualTest() {
		boolean result=relational.notEqual(12, 8);
		System.out.println(" != operator result : "+result);
		assertTrue(result);
	}
}
