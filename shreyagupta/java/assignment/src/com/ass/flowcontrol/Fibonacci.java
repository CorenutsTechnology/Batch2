package com.ass.flowcontrol;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci fibonacciNum=new Fibonacci();
		fibonacciNum.avgOfFibonacci(20);

	}

	public int avgOfFibonacci(int count) {
		int sum = 0;
		int num1 = 1, num2 = 1;
		int countStart = 1;
		System.out.println("Fibonacci series from 1 to "+count+" :");
		while (countStart <= count) {
			System.out.print(num1+" ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			countStart++;
		}
		System.out.println();
		System.out.println("average of Fibonacci series: " + sum / count);
		return sum / count;

	}
}
