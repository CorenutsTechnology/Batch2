package day_09_11_23Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import day_09_11_23_Assignment.ArithmeticOperators;

public class ArithmeticOperatorsTest {
	
	ArithmeticOperators operatorsTest=new ArithmeticOperators();
	
	@Test
	public void additionTest() {
		int result=operatorsTest.addition(10,100);
		assertEquals(130, result);
	}
	
	@Test
	public void substractionTest() {
		double result=operatorsTest.substraction(5, 2.5);
		assertEquals(5, result);
	}
	
	@Test
	public void multiplicationTest() {
		double result=operatorsTest.multiplication(3.4, 5.2);
		assertEquals(17.68, result);
	}
	
	@Test
	public void divisionTest() {
		int result=operatorsTest.division(10, 100);
		assertEquals(0, result);
	}
	
	@Test
	public void divisionTest1() {
		double result=operatorsTest.division1(10, 100);
		assertEquals(0.1, result);
	}
	
	@Test
	public void divisionTest2() {
		double result=operatorsTest.division2(10.5, 3);
		assertEquals(3.5, result);
	}
	
	@Test
	public void modulusTest() {
		int result=operatorsTest.modulus(3, 10);
		assertEquals(3, result);
	}
	
	@Test
	public void modulusTest1() {
		double result=operatorsTest.modulus1(4,1.2 );
		assertEquals(0.40000000000000013, result);
	}
	
	@Test
	public void modulusTest2() {
		double result=operatorsTest.modulus2(3.4, 2.3);
		assertEquals(1.1, result);
	}
}
