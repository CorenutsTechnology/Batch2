package com.crnts.operators;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticTest {

	ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

@Test	
public void additionTest() {
	int result=arithmeticOperations.addition(1, 5);
	assertEquals(6, result);
	
}	
@Test
public void subtractionTest() {
	int result=arithmeticOperations.subtraction(1, 5);
	assertEquals(-4, result);
	
}
@Test
public void divisionTest() {
	int result=arithmeticOperations.division(10, 5);
	assertEquals(2, result);
	
}
@Test
public void multiplicationTest() {
	int result=arithmeticOperations.multiplication(2, 2);
	assertEquals(4, result);
	
}
@Test
public void modulusTest() {
	int result=arithmeticOperations.modulus(12, 2);
	assertEquals(0, result);
	
}
	

}
