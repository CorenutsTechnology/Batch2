package com.org.exception20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsCheck {

	public static void main(String[] args)  {
		System.out.println("main start");
		ThrowsCheck throwCheck=new ThrowsCheck();
	
			try {
				FileInputStream fileinput=new FileInputStream("d:desktop//feuji");
			} catch (FileNotFoundException e) {
				System.out.println("handled filenot found");
				//e.printStackTrace();
			}
			System.out.println("main end");
	}
	public void checkThrow() throws FileNotFoundException
	{
		throw new FileNotFoundException();
	}
	

}
