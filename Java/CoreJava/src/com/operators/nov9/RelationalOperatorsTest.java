package com.operators.nov9;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.Test;

public class RelationalOperatorsTest 
{
	RelationalOperators relationalOperators = new RelationalOperators();
	 @Test
	 void greaterThanTest()
	 {
		 boolean result= relationalOperators.greaterThan(10,20);
		 System.out.println("greaterThan result: "+result);
		 assertFalse(result);
	 }
	 
	 @Test
	 void lessThanTest()
	 {
		 boolean result= relationalOperators.lessThan(10,20);
		 System.out.println("lessThan result: "+result);
		 assertTrue(result);
	 }
	 
	 @Test
	 void greaterThanOrEqualTest()
	 {
		 boolean result= relationalOperators.greaterThanOrEqual(10,20);
		 System.out.println("greaterThanOrEqual result: "+result);
		 assertFalse(result);
	 }
	 
	 @Test
	 void lessThanOrEqualTest()
	 {
		 boolean result= relationalOperators.lessThanOrEqual(10,20);
		 System.out.println("lessThanOrEqual result: "+result);
		 assertTrue(result);
	 }
	 
	 @Test
	 void EqualTest()
	 {
		 boolean result= relationalOperators.equal(10,20);
		 System.out.println("equal result: "+result);
		 assertFalse(result);
	 }
	 
}
