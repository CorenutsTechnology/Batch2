package com.org.exception20;

public class HandleByCallerClass {
	public void methodOne() throws Exception
	{
		throw new Exception();
	}
	public static void main(String[] args) {
		HandleByCallerClass handle=new HandleByCallerClass();
		try
		{
			System.out.println("start");
			handle.methodOne();	
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		System.out.println("end");
	}
	

}
