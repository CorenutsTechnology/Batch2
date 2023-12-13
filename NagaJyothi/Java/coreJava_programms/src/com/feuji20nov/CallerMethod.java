package com.feuji20nov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CallerMethod 
{
	Scanner scan=new Scanner(System.in);
	public void callerMethod()
	{
		System.out.println("Enter value");
		try
		{
			
		int value1=scan.nextInt();
		
			System.out.println(value1);
		}
		catch (InputMismatchException e) 
		{
			try
			{
			throw new ArithmeticException();
			}
			catch (Exception e1) 
			{
				System.out.println("Enter only integers: "+e1.getMessage());
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) 
	{
		CallerMethod result=new CallerMethod();
		result.callerMethod();
		
		
	}

}
