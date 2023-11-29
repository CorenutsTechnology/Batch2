package com.cnts.operator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArthematicTest {

	
		
		ArthematicalOperator ArthematicalOperator=new ArthematicalOperator();
	@Test
	public void additionTest() {
		int result=ArthematicalOperator.addition(10, 100);
		assertEquals(130, result);
	}
	@BeforeEach
	public void Before() {
		System.out.println("before");
	}
	@AfterEach
	public void After() {
		System.out.println("after");
	}
	@Test
	
	public void SubctractionTest() {
		double result=ArthematicalOperator.Subtraction(10, 100.0);
		assertEquals(-70, result);
	}
@Test
	
	public void multiplicationTest() {
		double result=ArthematicalOperator.mutiplication(10, 100);
		assertEquals(1020, result);
	}
@Test

public void DivisionTest() {
	double result=ArthematicalOperator.division(10, 100.5);
	assertEquals(5.525, result);
}
@Test

public void modulesTest() {
	double result=ArthematicalOperator.modules(10, 100);
	//assertEquals(5.525, result);
}

}
