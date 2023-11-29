package com.cnts.nov20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CallerClass_7
{
	public void method1()
	{
		int value1=2;
		int value2=10;
		System.out.println(value2/value1);     //ArithmeticException
	}
	
	public void method2()
	{
		String string = "CoreNuts and Feuji";
		char charecter = string.charAt(20);
		System.out.println(charecter);      //StringIndexOutOfBoundsException
	}
	
	public void method3() throws FileNotFoundException
	{
		FileInputStream stream = new FileInputStream("File.txt");      //FileNotFoundException
	}
}
