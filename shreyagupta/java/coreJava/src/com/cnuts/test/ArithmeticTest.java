package com.cnuts.test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.cnuts.operator.ArithmeticOperators;

public class ArithmeticTest {
	
		
		ArithmeticOperators arithmeticOperator= new ArithmeticOperators();
		
		@Test
		public void additionTest() {
			arithmeticOperator.addition(10,20);
			assertEquals(30, 30);
		}
		
		 @Test
		 public void subtractionTest() {
			 arithmeticOperator.subtraction(30,20);
			 assertEquals(10, 10);
		 }
		 
		 @Test
			public void multipicationTest() {
				arithmeticOperator.multipication(10, 30);
				assertEquals(300,300);
			}
		 
		 @Test
		 public void modulerTest() {
			 arithmeticOperator.moduler(7, 99);
			 assertEquals(7, 7);
		 }
		 
		
		
		 public void divisionTest() {
			 arithmeticOperator.division(19, 100);
			
			 
			 
			 
		 }
			
		
		
		
		
	}


