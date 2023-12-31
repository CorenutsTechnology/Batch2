package com.exception2.nov20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CallerMethod6 {

	public void findFile() throws FileNotFoundException
	{
		System.out.println("findFile method is started");
		File file = new File("E://file.txt");
	    FileReader fr = new FileReader(file);
		System.out.println("findFile method is ended");

	}
	public static void main(String[] args) 
	{
		System.out.println("main method is started");
		CallerMethod6 callerMethod = new CallerMethod6();
		try {
			callerMethod.findFile();
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("main method is ended");

	}

}
