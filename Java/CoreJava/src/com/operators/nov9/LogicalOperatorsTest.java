package com.operators.nov9;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class LogicalOperatorsTest 
{
	LogicalOperators logicalOperators = new LogicalOperators();
	 @Test
	 void andTest()
	 {
		 boolean result= logicalOperators.and(10,20);
		 System.out.println("and result: "+result);
		 assertFalse(result);
	 }
	 @Test
//	 @Ignore
	 void orTest()
	 {
		 boolean result= logicalOperators.or(10,20);
		 System.out.println("and result: "+result);
		 assertFalse(result);
	 }
	 
	 @Test
	 void notTest()
	 {
		 boolean result= logicalOperators.not(10,20);
		 System.out.println("and result: "+result);
		 assertTrue(result);
	 }

	 
}
