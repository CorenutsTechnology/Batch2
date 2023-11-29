package com.crnt.flowcontrols.nov1023;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.crnt.nov07231.Employee;

public class LoopingStatementTest {
	LoppingStatement loopingStatement = new LoppingStatement();
	//@Test
	public void whileTest()
	{
		
		boolean result = loopingStatement.whileStatement();
		assertTrue(result);		
	}
	@Before
	
	public void beforeTest()
	{
		System.out.println("********************before*****************");
	}
	@After
	public void afterTest()
	{
		System.out.println("********************afterrr*****************");
	}
	

	
	//@Test
	public void forTest()
	{
		boolean result = loopingStatement.forLoop();
		assertTrue(result);
	}
	@Test
  public void arrayTest()
  {
	  Employee [] result = loopingStatement.arrayObject();
	 
	  
  }
}
