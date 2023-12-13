package com.org.operators09;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class ArthimeticOperatorTest {

	ArithematicOperator arithematicOperator =new ArithematicOperator();
	
	
	@Test
	public void additionTest()
	{
		int result=arithematicOperator.addition(10,20);
		assertEquals(30,result);
	}
	
	@Test
	public void substractionTest()
	{
		int result=arithematicOperator.substraction(30, 10);
		assertEquals(20,result);
	}
	
	@Test
	public void multiplicationTest()
	{
		int result=arithematicOperator.multiplication(20, 10);
		assertEquals(200,result);
	}

	@Test
	public void divisionTest()
	{
		double result=arithematicOperator.division(20, 10);
		assertNotEquals(2,result);
	}
	@Test
	public void modulodivisionTest()
	{
		double result=arithematicOperator.moduloDivision(10,100);
		assertNotEquals(0,result);
	}
	
}
