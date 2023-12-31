package com.set.dec4;

import org.junit.jupiter.api.Test;

public class JunitTest 
{
	
	@Test
	public void test3()
	{
		System.out.println("test -- 3");
//		new StudentImpl3().method();
	}
	@Test
	public void test4()
	{
		System.out.println("test -- 4");
		new PrimitiveSet().method();
	}
	
	@Test
	public void test5() {
		System.out.println("test -- 5");
		new StudentsSet().method();
	}
	
	@Test
	public void test6() {
		System.out.println("test -- 6");
		new DifferenceOfTreeSetHashSet().method();
//		new DifferenceOfTreeSetHashSet().method2();
//		new DifferenceOfTreeSetHashSet().method3();
	}
	
	@Test
	public void test7() {
		System.out.println("test -- 7");
		new Difference().linkedListMethod();
		new Difference().hashSetMethod();
	}
	
	@Test
	public void test8() {
		System.out.println("test -- 8");
//		new Program8().method();
//		new Program8().method2();
	}
	
	@Test
	public void test9()
	{
		System.out.println("test -- 9");
//		new Program9().method();
	}
	
	@Test
	public void test10()
	{
		System.out.println("test -- 10");
		new Program10().method();
	}
	
}
