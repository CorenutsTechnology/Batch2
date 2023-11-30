package day_09_11_23Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import day_09_11_23_Assignment.Bitwise_Logical_andOperators;

public class Bitwise_Logical_andOperatorsTest {
	
	Bitwise_Logical_andOperators operators=new Bitwise_Logical_andOperators();
	
	@Test
	public void bitwiseANDTest() {
		int result=operators.bitwiseAND(7, 5);
		assertEquals(5, result);
	}
	
	@Test
	public void logicalAndTest() {
		boolean result=operators.logicalAnd(12, 8);
		assertFalse(result);
	}
}
