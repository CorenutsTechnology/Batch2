//Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.
package com.crnts.FunctionalInterfaceAssignment;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class SumOfPrime {
	public static void main(String[] args) {

		SumOfPrime sumOfPrime = new SumOfPrime();
		sumOfPrime.usingPredicate();
		sumOfPrime.usingSupplier();
	}

	public void usingSupplier() {
		Supplier<Integer> loop = () -> {
			int sum = 0;
			for (int index = 10; index <= 15; index++) {
				if (prime(index)) {
					System.out.println("Prime nums are : " + index);
					sum += index;
				}
			}

			System.out.println("Sum : " + sum);
			return sum;

		};
		loop.get();
	}

	public void usingPredicate() {
		Predicate<Integer> even = SumOfPrime::prime;
		int sum = 0;
		for (int index = 10; index <= 15; index++) {
			if (prime(index)) {
				System.out.println("Prime nums are : " + index);
				sum += index;
			}

		}
		System.out.println(sum);
	}

	public static boolean prime(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		return c == 2;
	}
}
