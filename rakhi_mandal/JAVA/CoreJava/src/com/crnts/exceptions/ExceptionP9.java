package com.crnts.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionP9 {

	public static void main(String[] args) {
		FileInputStream fileInputStream=null;
		try {
//			fileInputStream=new FileInputStream("home/msg.txt");
			fileInputStream=new FileInputStream("/Users/Rakhi Mandal/Desktop/pro.txt");
//			
//		}
//		try (FileInputStream fileInputStream1=new FileInputStream("/Users/Rakhi Mandal/Desktop/pro.txt"))
//		{
//			//in try block close the file
//		}
			
		}catch(FileNotFoundException e)
		{
			System.out.println("exception handled");
		}
		finally {
			if(fileInputStream!=null)
			{
				try {
					fileInputStream.close();
					System.out.println("file closed");
				}catch(IOException e1)
				{
					System.out.println("IO Exception Handled");
				}
				finally {
					System.out.println("Last finally executed");
				}
			}
		}
	}

}
