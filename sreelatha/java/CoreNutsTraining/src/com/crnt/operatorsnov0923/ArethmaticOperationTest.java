package com.crnt.operatorsnov0923;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArethmaticOperationTest {
	ArethmaticOperator arethmaticOperator = new ArethmaticOperator();
	@Test
	public void addTest()
	{
		int result=arethmaticOperator.addition(10, 100);
		assertEquals(210, result);
	}
	@Test
	public void subTest()
	{
		int result=arethmaticOperator.subtraction(10, 100);
		assertEquals(10, result);
	}
	@Test
	public void mulTest()
	{
		int result=arethmaticOperator.multiplication(10, 100);
		assertEquals(1100, result);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void divTest()
	{
		double result=arethmaticOperator.division(10.0, 100);
		System.out.println("division result : "+result);
		assertEquals(0.1, result);
	}
	@Test
	public void modTest()
	{
		int result=arethmaticOperator.modulus(10, 100);
		assertEquals(10, result);
	}
	@Test
	public void incTest()
	{
		int result=arethmaticOperator.increment(10, 100);
		System.out.println("increment testing : "+result);
		assertEquals(120, result);
	}
	@Test
	public void decTest()
	{
		int result=arethmaticOperator.decrement(10, 100);
		System.out.println("decrement testing : "+result);
		assertEquals(9, result);
	}
	
	



}
