package com.org.first04;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		checkEvenOrOdd(n);

	}
	public static void checkEvenOrOdd(int n)
	{
		if(n%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
