package com.cnts.operator;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class conditionTest5 {
	ConditionalOperator ConditionalOperator=new ConditionalOperator();
	
	
	@BeforeEach
	public void Before() {
		//System.out.println("before");
	}
	@Test
	public void StringTest() {
		String result=ConditionalOperator.conditional(10, 20);
	}
		@Test
	public void instanceofString() {
		
			boolean result=ConditionalOperator.instanceofString("kalyani");
			System.out.println(result);
			assertTrue(result);
	}
		@Test
		public void instanceofString1() {
			
				boolean result=ConditionalOperator.instanceofString1("kalyani");
				System.out.println(result);
				assertTrue(result);
		}
		
	
	
	
	
	}
	
	
	
	
	
		
		
	


