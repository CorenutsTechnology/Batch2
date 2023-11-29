package com.cnts.nov17;

import java.util.Scanner;

public class ArithmaticException2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerator:");
		int num = sc.nextInt();
		System.out.println("Enter Denomerator:");
		int deno = sc.nextInt();
		try
		{
			double result = num/deno;
			System.out.println("Result:"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Occured becz "+e.getMessage());
		}
		finally {
			sc.close();
		}
		
		
	}
}
