package com.cnts.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cnts.nov9Operaters.ArithmeticOperators;

public class ArithmeticTest 
{
	ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
	
	@Test
	public void additionTest()
	{
		int result = arithmeticOperators.addition(100, 23);
		assertEquals(96, result);
	}
	
	@Test
	public void substractionTest()
	{
		int result = arithmeticOperators.substraction(250, 350);
		assertEquals(100, result);
	}
	
	@Test
	public void multiplicationTest()
	{
		double result = arithmeticOperators.multiplication(100,50);
		assertEquals(5100, result);
	}
	
	@Test
	public void divisionTest()
	{
		double result = arithmeticOperators.division(10,100);
		assertEquals(0.1, result);
	}
	
	@Test
	public void modulerTest()
	{
		double result = arithmeticOperators.moduler(2344, 3);
		assertEquals(1.0, result);
	}
}
