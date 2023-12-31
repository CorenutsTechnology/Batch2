package com.cupgame.nov14;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class LoopsTest 
{
	@BeforeClass
	void beforeAnnotation()
	{
		System.out.println("Before");
	}
	@Test
//	@Ignore
	void whileloop2Test() 
	{
		Loops loops = new Loops();
		loops.loop3();
		int result = loops.whileloop2(0);
		assertEquals(5,result);
	}
//	@Test
//	@Ignore
	void whileloop2Test2() 
	{
		Loops loops = new Loops();
		int result = loops.whileloop2(1);
		
		assertEquals(6,result);
	}
}
