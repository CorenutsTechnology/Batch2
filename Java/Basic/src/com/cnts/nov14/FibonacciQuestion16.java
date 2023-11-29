package com.cnts.nov14;

public class FibonacciQuestion16 {

	static int firstTerm = 0, secondTerm = 1;
	static int temp;
	static int sum=0;

	public static void main(String[] args) {

		int n = 20;
		FibonacciQuestion16 question16 = new FibonacciQuestion16();
		System.out.println("Fibonacci Series till " + n + " terms:");
		question16.printFibonacci(n);
		
//		for(int i=0;i<=n;i++)
//		{
//			temp=firstTerm+secondTerm;
//			sum+=temp;
//			firstTerm=secondTerm;
//			secondTerm=temp;
//		}
//		System.out.println("Average is: "+sum/n);
	}

	public void printFibonacci(int count) {
		
		for (int i = 1; i <= count; ++i) {
			System.out.print(firstTerm + " ");
			System.out.println();
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
