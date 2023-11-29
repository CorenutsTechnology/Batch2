package com.crnt.exception.nov2023;

import org.junit.Test;

public class AgeExceptionTest {
	AgeExceptionImpl nest = new AgeExceptionImpl();
	@Test
	public void test()
	{
		nest.print(20);
	}

}
