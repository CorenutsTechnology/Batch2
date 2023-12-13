package com.org.stream12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PrimeNumbers {
	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();

		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			list.add(r.nextInt());
		}

		List<Integer> primeNumbers = list.stream().filter(PrimeNumbers::isPrime).collect(Collectors.toList());
		System.out.println(primeNumbers);
	}
	
}
