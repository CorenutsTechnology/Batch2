package com.crnt.exception.nov1723;

import org.junit.Test;

public class HandleExceptionByTryAndCatchTest {
	HandleExceptionByTryAndCatchImpl handleExceptionByTryAndCatch = new HandleExceptionByTryAndCatchImpl();
	@Test
	public void ArrayIndexOBExceptionTest()
	{
		int result = handleExceptionByTryAndCatch.ArrayIndexOBException();
		System.out.println(result);
	}

}
