package com.assignment.nov11;
import java.util.Scanner;
public class Fibonacci16 
{
	public int printFibonacci(int value)
	{
		if(value == 0 || value ==1)
			return 1;
		else
			return printFibonacci(value-1)+printFibonacci(value-2);
	}
	
	public static void main(String[] args) 
	{
		Fibonacci16 fibonacci= new Fibonacci16();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of fibonacci numbers you want: ");
		int count = sc.nextInt();
		double sum=0;
		for(int index=0;index<count;index++)
		{
			int value=fibonacci.printFibonacci(index);
			System.out.println(value);
			sum += value;
		}
		System.out.println("Average is: "+(sum/count));
		sc.close();
	}

}
