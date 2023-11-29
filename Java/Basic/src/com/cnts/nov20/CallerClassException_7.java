package com.cnts.nov20;

import java.io.FileNotFoundException;

public class CallerClassException_7
{
	public static void main(String[] args) {
		CallerClass_7 class1 = new CallerClass_7();
		try {
			class1.method1();
		}
		catch (ArithmeticException e) {
			System.out.println("Methode 1 exception is handeled");
		}
		
		try {
			class1.method2();
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Methode 2 exception is handeled");
		}
		
		
		try {
			class1.method3();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("Methode 3 exception is handeled");
		}
	}
}
