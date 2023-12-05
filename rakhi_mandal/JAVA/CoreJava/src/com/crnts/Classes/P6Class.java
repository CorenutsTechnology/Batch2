package com.crnts.Classes;

import com.crnts.InterfacesException.P6Interface;

public class P6Class implements P6Interface {

	
	public void callingMethod()  {
		try {
		arithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled in calling method");
		}
		}
	
	public void arithmeticException() throws ArithmeticException  {
		int value1=7;
		int result =value1/0;
		}
		
	
	
}
