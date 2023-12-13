package com.org.exception20;

public class HandleFCallerMethod {

	public static void main(String[] args) {
		HandleFCallerMethod  handler=new HandleFCallerMethod();
		
			System.out.println("main start");
			handler.methodOne();
			System.out.println("main end");
	}
	public void methodOne()
	{
		try {
			int result=20/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithematic handled");
		}
	}

}
