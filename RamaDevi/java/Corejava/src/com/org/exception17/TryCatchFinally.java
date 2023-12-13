package com.org.exception17;

public class TryCatchFinally {
	int intValue;
	String name=null;
public void exception()
{
	
	System.out.println("start");
	try
	{
	int result=intValue/0;
	System.out.println("result"+result);
	System.out.println(name);
	}
//	catch(NullPointerException e )
//	{
//		System.out.println("NUllpointer exception");
//	}
	catch (ArithmeticException e) {
		System.out.println("arthimatic exception");
	}
	finally
	{
	System.out.println("finally");	
	}
	System.out.println("end");
}
	public static void main(String[] args) {
		TryCatchFinally trycatchfinally=new TryCatchFinally();
		trycatchfinally.exception();

	}

}
