package com.crnts.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.crnts.Classes.P6Class;

class P6Test {

	@Test
	void testP56() {
		P6Class p6Class=new P6Class();
		

		try {
			p6Class.arithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled in calling method");
		}

	}

}
