package com.crnt.exception.nov1723;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArethmaticExceptionTest {
	ArethmaticExceptionImpl arethmaticExceptionImpl= new ArethmaticExceptionImpl();
	HandleExceptionByTryAndCatchImpl handle = new HandleExceptionByTryAndCatchImpl();
	
	@Test
	public void divisionTest()
	{
		int result = arethmaticExceptionImpl.division();
		System.out.println("division result : "+result);
		//assertEquals(8, result);
	}
//	@Test
//	public void arrayTest()
//	{
//		int result = handle.ArrayIndexOBException();
//		System.out.println(result);
//	}

}
