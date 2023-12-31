package com.assignment.nov11;

import java.util.Scanner;

public class SumAndAverage {

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
		SumAndAverage sumAndAverage = new SumAndAverage();
		sumAndAverage.calculate(value);
	}

}
