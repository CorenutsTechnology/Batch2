package com.cnts.nov17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandel_1 {
public static void main(String[] args) {
	
	FileInputStream stream= null;
	try {
		stream= new FileInputStream("text.txt");
	} catch (FileNotFoundException e) {
		System.out.println("Exception occured...");
		for(int i=1; i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
}
