package com.org.constructors22;

import java.io.FileNotFoundException;

import javax.management.RuntimeErrorException;

public class ExceptionChild extends ExceptionCheck{
	public ExceptionChild()
	{
		
	}
	public void m1()throws ArithmeticException
	{
		System.out.println("exception in child ");
	//	System.out.println(10/0);
		//throw new FileNotFoundException();
	}

	public static void main(String[] args)  {
	ExceptionChild e=new ExceptionChild();
	//e.m1();

	}

}
