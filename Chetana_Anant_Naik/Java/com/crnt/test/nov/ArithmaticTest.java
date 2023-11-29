package com.crnt.test.nov;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class ArithmaticTest {
	@Before
public void beforeMethod() {
	System.out.println("_________BEFORE_________");
}
	@After
	public void afterMethod() {
		System.out.println("_________AFTER__________");
	}
	
@Test
public void aditionTest() {
	String value[]= {"one","two","three"};
	
	String value1[]= {"one","two","three"};
	
	assertEquals(value, value1);
	System.err.println("______test_____");
}
}
