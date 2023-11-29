package com.cnts.nov10loops;

import java.util.Scanner;

public class Question9 {

	void calculate(int value)
	{
		int sum = (value*(value+1))/2;
		double average=((double)sum/value);
		System.out.println("The Sum is: "+sum);
		System.out.println("The Average is: "+average);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UpperBound:");
		int value = sc.nextInt();
		Question9  sumAndAverage = new Question9 ();
		sumAndAverage.calculate(value);
		
		sc.close();
	}

}
