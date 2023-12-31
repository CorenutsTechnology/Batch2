package com.operators.nov9;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArithmeticOperatorsTest 
{
	ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
	
	@BeforeEach
	void test()
	{
		System.out.println("------before--------");	
	}
	
	@Test
	public void additionTest()
	{
		System.out.println("class is ArithmeticOperatorsTest and method is additionTest with "
				+ "no parameters");
		int result=arithmeticOperators.addition(10,20);
		System.out.println("addition result: "+result);
		assertEquals(30,result);
		System.out.println("additionTest method is ended");
	}
	
	@Test
	public void substractionTest()
	{
		System.out.println("class is ArithmeticOperatorsTest and method is substractionTest with "
				+ "no parameters");
		int result = arithmeticOperators.substraction(20,10);
		System.out.println("substraction result: "+result);
		assertEquals(10,result);
		System.out.println("substractionTest method is ended");
	}
	
	@Test
	public void multiplicationTest()
	{
		int result = arithmeticOperators.multiplication(20,10);
		System.out.println("multiplition result: "+result);
		assertEquals(200,result);
	}
	
	@Test
	public void divisionTest()
	{
		int result =  arithmeticOperators.division(20,10);
		System.out.println("division result: "+result);
		assertEquals(20,result);//this test case is failed, because division of 20,10 is 2 but not 
		//20
	}
	
	@Test
	public void modulerTest()
	{
		int result = arithmeticOperators.moduler(20,10);
		System.out.println("moduler result: "+result);
		assertEquals(0,result);
	}
	
	
}
