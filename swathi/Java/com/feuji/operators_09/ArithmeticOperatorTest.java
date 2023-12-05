package com.feuji.operators_09;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

import org.junit.jupiter.api.Test;

public class ArithmeticOperatorTest {
	
	ArithmeticOperators arithmeticOperators =new ArithmeticOperators();
	
	@Before
	public void before() {
		System.out.println("before");
		
	}
	
	@Test
	public void additionTest() {
		
	int result = arithmeticOperators.addition(10,10);
	assertEquals(20,result);
		
		
	}
	
	
	@Test
	public void subtractionTest() {
		
	int result = arithmeticOperators.subtraction(10,10);
	assertEquals(20,result);	
	}
	
	@Test
	public void multiplicationTest() {
		
	int result = arithmeticOperators.multiplication(10,10);
	assertEquals(200,result);	
	}
	
	@Test
	public void divisionTest() {
		int result = arithmeticOperators.division(10, 20);
		assertEquals(0,result);
	}
	
	@Test
	public void modulerTest() {
		
	int result = arithmeticOperators.moduler(10,10);
	assertEquals(0,result);
		
		
	}

}
