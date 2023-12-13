package com.org.exception17;

public class HandleNullPointer {
	String name;
	public void handleNull()
	{
	try
	{
		System.out.println("start");
		System.out.println(name.charAt(0));
	}
	catch(NullPointerException e)
	{
		System.out.println("Enter valid name");
		//name="devi";
		System.out.println(name.charAt(0));
		
	}
	
	finally
	{
		System.out.println("finaly");
		System.out.println("end");
	}
	}
	public static void main(String[] args) {
		HandleNullPointer handlenull=new HandleNullPointer();
		handlenull.handleNull();

	}

}
