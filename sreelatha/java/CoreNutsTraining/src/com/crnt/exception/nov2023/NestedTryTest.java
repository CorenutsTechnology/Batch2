package com.crnt.exception.nov2023;

import org.junit.Test;

public class NestedTryTest {
	NestedImpl nestedImpl = new NestedImpl();
	@Test
	public void tryTest()
	{
		int result = nestedImpl.function1();
	}

}
