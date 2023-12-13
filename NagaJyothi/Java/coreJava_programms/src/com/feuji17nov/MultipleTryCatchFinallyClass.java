package com.feuji17nov;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatchFinallyClass implements MultipleTryCatchFinally {
	FileInputStream stream = null;
	Scanner scan=new Scanner(System.in);
	int a=10;

	public void multipleTryCatchFinally() {
		try {
			System.out.println("Enter elemnts");
			int a=scan.nextInt();
			//FileInputStream stream = new FileInputStream("com.feuji.17nov.Exception.java");
			
			try
			{
			accessingElements(new int[] { 1, 2, 3, 4 });
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundException:" + e.getMessage());
				return;
			}
			FileInputStream stream = new FileInputStream("com.feuji.17nov.Exception.java");
			

		} catch (InputMismatchException e) {

			e.printStackTrace();
			System.out.println("input mismatch  exception");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Exception:" + e.getMessage());
		}
		finally
		{
			System.out.println("final block");
			if(stream!=null)
			{
				try
				{
					stream.close();
					System.out.println("finally block cose");
				}catch (IOException e) {
					System.out.println("Io exception handled");
				}
			}
		}

	}

	@Override
	public void accessingElements(int[] array)
	{
		int sum = 0;
		for (int index1 = 0; index1 <= array.length - 1; index1++) { 
			System.out.println(array[6]);
		sum=sum+index1;
		}
			
	}
	public static void main(String[] args) 
	{
		MultipleTryCatchFinallyClass result=new MultipleTryCatchFinallyClass();
		result.multipleTryCatchFinally();
		
	}

	

}
