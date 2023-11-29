package com.crnt.operatorsnov0923;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogicalOperatorTest {
LogicalOperator logicalOperator = new LogicalOperator();
@Test
	public void andTest()
	{
		boolean result = logicalOperator.andOperator(10, 100);
		System.out.println("and test result is : "+result);
		assertFalse(result);
			}
@Before
public void before()
{
	System.out.println(".................Before...............");
}

public void beforeEach()
{
	System.out.println(".................Before...............");
}
@Test
public void orTest()
{
	boolean result = logicalOperator.orOperator(10, 100);
	System.out.println("the resulted value for orTest :"+result);
	assertTrue(result);
}

}
