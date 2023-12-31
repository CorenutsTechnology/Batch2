//1. Write a program to throw checked exceptions using throw and throws ?

package com.exception2.nov20;

public class CheckedException1 
{

	public void show() throws ClassNotFoundException
	{
		System.out.println("show method is started");
		System.out.println("Raising checked exception using throw in show method");
		throw new ClassNotFoundException("helo");
//		System.out.println("view method is ended"); //unreachable code
	}
	
	public void view() throws ClassNotFoundException
	{
		System.out.println("view method is started");
		show();
		System.out.println("view method is ended");

	}
	public static void main(String[] args)
	{
		
		CheckedException1 checkedException1 = new CheckedException1();
		try  {
			checkedException1.view();
			System.out.println("hello");
		}catch(ClassNotFoundException e )
		{
//			System.out.println(e);
			System.out.println("ClassNotFoundException is raised and handled here");
		}
		
	}

	

}
