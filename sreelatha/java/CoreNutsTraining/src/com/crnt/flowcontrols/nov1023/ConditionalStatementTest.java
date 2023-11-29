package com.crnt.flowcontrols.nov1023;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ConditionalStatementTest {
	ConditionalStatements conditionalStatements= new ConditionalStatements();
	
	@Test
	public void ifTest()
	{
		boolean result = conditionalStatements.ifStatements(10, 100);
		assertFalse(result);
	}
//	@Test
//	public void elseIfTest()
//	{
//	String result = conditionalStatements.switchStatement("HYDERABAD");
//	assertEquals("HYDERABAD", result);
//     }
//	

}
