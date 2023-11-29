package com.crnt.exception.nov2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {
	public static void main(String[] args) {
		System.out.println("calling main");
		try {
			function1();
		} catch (Exception e) {
			System.out.println("main catch will be exeuted..");
			System.out.println(e.getMessage());
		}
		System.out.println("called function 1");
	}

	private static void function1() throws FileNotFoundException {
		System.out.println("calling function 1");
		function2();
		System.out.println("called function 2");
		
		
	}

	private static void function2() throws FileNotFoundException{
		System.out.println("calling function 2");
		
		/* try { */
			calculate(2,3,0);
			
			/*
			 * System.out.println("with in try block "); }
			 *  catch (RuntimeException e) {
			 * System.out.println("Arithmatic exception will be handled");
			 * System.out.println(e.toString()); }
			 */
			 
		System.out.println("called function calculate");
		
		
	}

	private static void calculate(int i, int j, int k) throws FileNotFoundException{
		String file1 ="C:\\Users\\ADMIN\\Downloads";
		
		try {
			FileInputStream file = new FileInputStream(file1);
			System.out.println(file);
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("file not found");
			//throw new FileNotFoundException("file not found");
		}
		
		int result = (i/j)/k;
		//System.out.println(result);
	}
	

}
