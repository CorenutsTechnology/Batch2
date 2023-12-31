//7. Write a program to handle exception by caller Class?
package com.exception2.nov20;

import java.io.FileNotFoundException;

public class CallerClassHandleException7 {

	public static void main(String[] args) 
	{
		System.out.println("main method is started");
		CalledClass7 calledClass7 = new CalledClass7();
		try 
		{
			calledClass7.findFile();
			System.out.println("hi");
		} catch (FileNotFoundException e) 
		{
			System.err.println(e);
		}
		System.out.println("main method is ended");

	}

}
