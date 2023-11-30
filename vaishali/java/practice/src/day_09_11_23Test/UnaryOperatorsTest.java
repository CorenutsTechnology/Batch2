package day_09_11_23Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import day_09_11_23_Assignment.UnaryOperators;

public class UnaryOperatorsTest {
	
	UnaryOperators unaryOperators=new UnaryOperators();
	
	@Test
	public void preIncrementTest() {
		int result=unaryOperators.preIncrement(12);
		assertEquals(13, result);
	}
	
	@Test
	public void preIncrementTest1() {
		int result=unaryOperators.preIncrement1(15);
		assertEquals(16, result);
	}
	
	@Test
	public void preIncrementTest2() {
		int result=unaryOperators.preIncrement2(20);
		assertEquals(22, result);
	}
	
	@Test
	public void preIncrementTest3() {
		double result=unaryOperators.preIncrement3(12.3);
		assertEquals(13.3, result);
	}
	
	@Test
	public void postIncrementTest() {
		int result=unaryOperators.postIncrement(28);
		assertEquals(29, result);
	}
	
	@Test
	public void postIncrementTest1() {
		int result=unaryOperators.postIncrement1(31);
		assertEquals(32, result);
	}
	
	@Test
	public void postIncrementTest2() {
		int result=unaryOperators.postIncrement2(67);
		assertEquals(69, result);
	}
	
	@Test
	public void postIncrementTest3() {
		double result=unaryOperators.postIncrement3(65.4);
		assertEquals(66.4, result);
	}
	
	@Test
	public void preDecrementTest() {
		int result=unaryOperators.preDecrement(12);
		assertEquals(11, result);
	}
	
	@Test
	public void preDecrementTest1() {
		int result=unaryOperators.preDecrement1(15);
		assertEquals(14, result);
	}
	
	@Test
	public void preDecrementTest2() {
		double result=unaryOperators.preDecrement2(12.3);
		assertEquals(11.3, result);
	}
	
	@Test
	public void postDecrementTest() {
		int result=unaryOperators.postDecrement(28);
		assertEquals(27, result);
	}
}
