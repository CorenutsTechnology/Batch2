package com.org.MethodRef11;

import java.util.function.Predicate;

public class PrimeNumbersum {

//	public boolean isPrime(int num) {
//		int count = 0;
//		if (num <= 1)
//			return false;
//		else
//		{
//		for (int i = 2; i <= num / 2; i++) {
//			if (num % i == 0) {
//				count++;
//			}
//		}
//		}
//		if (count == 2)
//			return true;
//		else
//			return false;
//	}

	public static void main(String[] args) {
		PrimeNumbersum prime = new PrimeNumbersum();
		Predicate<Integer> pre = (num) -> {
			int count = 0;
			if (num <= 1)
				return false;
			else {
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						count++;
					}
				}
			}
			if (count == 2)
				return true;
			else
				return false;
		};

		int sum = 0;
		for (int i = 1; i <= 15; i++) {
			if (pre.test(i)) {
				sum += i;
			}

		}
		System.out.println(sum);

		// Using Method Reference

//		Predicate<Integer> pre = prime::isPrime;
//		int sum = 0;
//		for (int i = 1; i <= 15; i++) {
//			if (pre.test(i)) {
//				sum += i;
//			}
//
//		}
//		System.out.println(sum);

	}

}
