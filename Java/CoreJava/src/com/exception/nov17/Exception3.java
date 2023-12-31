//Write a program to handle the exception in try, catch, finally blocks?
package com.exception.nov17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception3 
{
	public void exceptionMethod()
	{
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\Welcome\\Documents\\MyDocuments\\pancard_dob.pdf");
			System.out.println("file is opened");
		}
//		catch(Exception e)
//		{
//			System.out.println("hi");
//		} 
		catch(FileNotFoundException e) {
			System.out.println("file is not found and exception handled");
		}
		finally {
			if(fileInputStream != null)
			{
				try {
					fileInputStream.close();
					System.out.println("file closed..");
				} catch (IOException e) {
					e.getMessage();
				}
			}
		}
		
	}
	public static void main(String[] args) 
	{
		Exception3 exception3 = new Exception3();
		exception3.exceptionMethod();
	}
}
