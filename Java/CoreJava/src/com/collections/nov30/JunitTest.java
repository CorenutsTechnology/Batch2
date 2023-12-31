package com.collections.nov30;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;

public class JunitTest 
{
	
	@Test
	@Order(1)
	void ArrayToCollectionTest()
	{
		System.out.println("starting execution of program 1 ");
		String result = new ArrayToCollection1().convert();
		assertEquals("success",result);
	}
	@Test
	@Order(2)
	void CollectionToArrayTest()
	{
		System.out.println("starting execution of program 2 ");
		String result = new CollectionToArray().convert();
		assertEquals("success",result);
	}
	@Test
	@Order(3)
	void PrintCollection3Test()
	{
		System.out.println("starting execution of program 3 ");
		String result = new PrintCollection3().method();		
		assertEquals("success",result);
	}
	@Test
	@Order(4)
	void PrintPrimitives4Test()
	{
		System.out.println("starting execution of program 4 ");
		String result = new PrintPrimitives4().print();		
		assertEquals("success",result);
	}
	
	@Test
	@Order(5)
	void StudentList5Test()
	{
		System.out.println("starting execution of program 5 ");
		String result = new StudentList5().store();		
		assertEquals("success",result);
	}
	
	@Test
	@Order(6)
	void Difference6Test()
	{
		System.out.println("starting execution of program 6 ");
		String result = new Difference6().display();		
		assertEquals("success",result);
	}
	
	@Test
	@Order(7)
	void Difference7Test()
	{
		System.out.println("starting execution of program 7 ");
		String result = new Difference7().show();		
		assertEquals("success",result);
	}
}
