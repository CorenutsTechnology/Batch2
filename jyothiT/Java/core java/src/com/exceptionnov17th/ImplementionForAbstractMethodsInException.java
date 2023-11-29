package com.exceptionnov17th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImplementionForAbstractMethodsInException implements AbstractMethodsOfException{
	
	String name;

	
	public void handleExceptionUsingTryCatch() {
		  int value[]= {1,2,3};
        try {
			
			System.out.println(value[4]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			
  		}
	}
	
	
	public static void main(String[] args) 
	{
		ImplementionForAbstractMethodsInException cal=new ImplementionForAbstractMethodsInException();
//		cal.handleExceptionUsingTryCatch();
//		cal.raisingArithmaticException();
//		cal.handleExceptionIn3Blocks();
//		cal.handleExceptionInFinally();
//		cal.handleExceptionByMultipleCatch();
		cal.handleMultipleExceptionInOneCatch();
//		cal.throwNullPointerException();
//		cal.handleNullPointerException();
	}


	
	public void handleExceptionIn3Blocks() {

		try {
			int value=30/0;
			
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("this is finalize method");
		}
		
	}


   public void raisingArithmaticException() {
      
		try {
			int value=30/0;
			System.out.println(value/0);
			
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
	}


	
	public void handleExceptionInFinally() {
		
		   try 
		   {
			   int value=10/0;
		   }
		  finally {
			System.out.println("this is finally block");
		}

	}


	@Override
	public void handleExceptionByMultipleCatch() 
	{
		try {
			int arrayValue[]= {1,2,3};
			System.out.println(arrayValue[arrayValue.length]);
			
		} catch (StringIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}
		catch (NullPointerException e1) {
			e1.printStackTrace();
		}
		catch (ArithmeticException e2) {
			e2.printStackTrace();
		}
		
	}


	@Override
	public void handleMultipleExceptionInOneCatch() {
		
		try {
			int value=10;
			System.out.println(value/0);
			
		} catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
			return;
			
		}
		System.out.println("it is handle");
		
	}


	@Override
	public void throwNullPointerException() {
		
		String name=null;
		try {
			if(name.equals("jyothi"))
			{
				System.out.println("same name");
			}
			else
			{
				System.out.println("its not same name");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		
	}
	
public void handleNullPointerException() {
		
	String name=null;
	if(name.equals("jyothi"))
	{
		System.out.println("same name");
	}
	else
	{
		System.out.println("its not same name");
	}
	
	}


@Override
public void handleExceptionInMultipleBlocks() {
	
	FileInputStream file=null;
	   try 
	   {
		file=new FileInputStream("home/home.txt");
		try {
			int value=10/0;
			System.out.println(value);
			
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		}
	   }
	   catch (FileNotFoundException e) 
	   {
		e.printStackTrace();
		try {
			int arrayValue[]= {1,2};
			System.out.println(arrayValue[2]);
		} catch (ArrayIndexOutOfBoundsException e2) {
			e2.printStackTrace();
		}
	   }
	   finally {
		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	
}
}
