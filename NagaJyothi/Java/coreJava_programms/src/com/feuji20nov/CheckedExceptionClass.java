package com.feuji20nov;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionClass implements CheckedException
{
	Scanner scan=new Scanner(System.in);

	@Override
	public int caluclate(int value1, int value2) throws ArithmeticException
	{
		int result=(value1/value2);
		System.out.println("Result:"+result);
		return result;
		
	}

	@Override
	public void accessingElements(int[] arr) throws ArrayIndexOutOfBoundsException
	{
		
		for(int index=0;index<=arr.length-1;index++)
		{
			System.out.println(arr[index]);
		}
		
	}
	public void checkMethod()
	{
		System.out.println("Enter value1");
		int value1=scan.nextInt();
		System.out.println("Enter value2");
		int value2=scan.nextInt();
		//accessingElements(new int[] {1,2,3,4,5});
		try
		{
		int result=caluclate(value1,value2);
		accessingElements(new int[] {1,2,3,4,5});
		/*
		 * try { accessingElements(new int[] {1,2,3,4,5}); }catch (Exception e) {
		 * System.out.println("ArrayIndex out bound Exception occured..."); }
		 */
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occured...");
		}
		catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndex out bound Exception occured...");
			}
     }
	public void fileNotFound( String name) throws FileNotFoundException
	{
		throw new FileNotFoundException("File not found");
	}
	public static void main(String[] args) 
	{
		CheckedExceptionClass referance=new CheckedExceptionClass();
		referance.checkMethod();
		try {
			referance.fileNotFound("Jyothi.text");
		} catch (FileNotFoundException e) {
		System.out.println("File not found exception occured");
		}
	
		
	}
	

}
