package com.cnts.nov22;

import java.io.IOException;

class SuperClass3
{
	public void method1() throws Exception
	{
		System.out.println("SuperClas");
	}
	
	public void method2() throws RuntimeException
	{
		System.out.println("Superclass method throwing runtime exception");
	}
}

class SubClass3 extends SuperClass3
{
	//public void method2() throws Exception    // throws comile time error
//	public void method2() throws IOException
	public void method2() throws NullPointerException
	{
		
		System.out.println("Subclass");
	}
}
public class Case3 {
	public static void main(String[] args) {
		SubClass3 class3 = new SubClass3();
		class3.method2();
	}

}
