package com.crnts.exceptions;

import java.util.Scanner;

public class P6Exception implements ExceptionP6 {
	Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		P6Exception p6Exception=new P6Exception();
		p6Exception.handleException();
	}
	public  void handleException()
	{
		
		try{int[] array={9,4,99,0,8,3};
			System.out.println("Enter the array index:");
		   int responseIndex=sc.nextInt();
		   
		   System.out.println("Enter any number :");
		   int response=sc.nextInt();
		
			for(int index=0;index<=array.length;index++)
		{ 
			System.out.println(array[responseIndex]/response);
		}
	}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Both Exceptions handled in single catch block");
//			e.printStackTrace();
		}
		
		
	}
}
