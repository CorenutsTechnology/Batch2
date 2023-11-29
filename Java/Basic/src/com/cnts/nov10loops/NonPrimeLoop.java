package com.cnts.nov10loops;

public class NonPrimeLoop {
	public static void main(String[] args) {
		NonPrimeLoop nonPrimeLoop = new NonPrimeLoop();
		System.out.println("Non prime number from 1 to 100 By FOR Loop");
		nonPrimeLoop.nonPrimNumberFor();
		System.out.println("---------------------------------------");
		System.out.println("Non prime number from 1 to 100 By While Loop");
		nonPrimeLoop.nonPrimNumberWhile();
		System.out.println("---------------------------------------");
		System.out.println("Non prime number from 1 to 100 By Do-While Loop");
		nonPrimeLoop.nonPrimeNumberDoWhile();
		System.out.println("---------------------------------------");

	}

	public void nonPrimNumberFor() {
		for (int start = 1; start <= 100; start++) {
			int count = 0;
			for (int divisibel = 2; divisibel <= start/2; divisibel++) {
				if (start % divisibel == 0) {
					count++;
				}
			}
			if (count != 0 || start==1) {
				System.out.print(start+" ");
			}
		}
	}

	public void nonPrimNumberWhile() {
		 int number = 1;
		    while (number <= 100) {
		        int count = 0;  // Reset count for each number
		        for (int j = 1; j <= number; j++) {
		            if (number % j == 0) {
		                count++;
		            }
		        }
		        if (count != 2) {
		            System.out.print(number+" ");
		        }
		        number++;  // Increment the number for the next iteration
		    }
	}

	public void nonPrimeNumberDoWhile()
	{
		int number=1;
		do {
			int count = 0;
			for (int num2 = 1; num2 <= number; num2++) 
			{
				if (number % num2 == 0)
				{
					count++;
				}
			}
			if (count != 2) {
				System.out.print(number+" ");
			}
			number++;
		} while (number<=100);
		
	}
}
