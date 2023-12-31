package com.operators.nov9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.crnt.nov7.Person;

public class MiscellenousOperatorsTest 
{
	MiscellenousOperators miscellenousOperators = new MiscellenousOperators();
	@Test
	void terinaryTest()
	{
		String result = miscellenousOperators.terinary(10,20);
		assertEquals("lesser" ,result);
	}
	
	@Test
	void instanceofTest()
	{
		boolean result = miscellenousOperators.instanceofMethod("pravalika");
		assertTrue(result);
	}
	
	@Test
	void instanceofPerson()
	{
		boolean result = miscellenousOperators.instanceofPerson(new Person(null, 0, 0, null));
		assertFalse(result);
	}
}
