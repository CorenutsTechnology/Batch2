package com.org.exception20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NestedTry {

	public static void main(String[] args) {
		try
		{
			System.out.println("main start");
		int[] array= {3,5,7,8};
		System.out.println(array[3]);
			try
			{
			String s="ram";
			System.out.println(s.length());
				try
				{
				FileInputStream file=new FileInputStream("d:desktop\\feuji");
				}
				catch(FileNotFoundException e)
				{
					System.out.println("file handled");
				}
			
		}
			catch(NullPointerException e)
			{
				System.out.println("handled");
			}
		}
		finally
		{
			System.out.println("finaly");
		}
		System.out.println("main end");
	}

}
