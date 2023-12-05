package com.crnts.exceptions;

import java.util.Scanner;

public class ExceptionP5 implements P5Exception  {
	  Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		ExceptionP5 exceptionP5=new ExceptionP5();
		exceptionP5.handleException();
	}
	@Override
	public  void handleException()
	{
		int[] array={9,4,3};
		try{
			System.out.println("Enter the array index:");
		   int responseIndex=sc.nextInt();
		   
		   System.out.println("Enter any number :");
		   int response=sc.nextInt();
		
			for(int index=0;index<=array.length;index++)
		{ 
			System.out.println(array[responseIndex]/response);
		}
	}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Exception handled");
//			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException Exception handled");
//		e.printStackTrace();
	}  
	
		finally {
			System.out.println("finnaly bolock executed");
		}
		
	}

}
