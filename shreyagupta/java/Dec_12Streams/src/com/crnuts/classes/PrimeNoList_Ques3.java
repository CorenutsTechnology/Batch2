package com.crnuts.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PrimeNoList_Ques3 {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				return false;
			}
		}
		return true;
	}

	public void primeNumberList() {
		List<Integer> list = new ArrayList<>();
		Random r = new Random();

		for (int i = 0; i < 1000; i++) {
			list.add(r.nextInt(1000));
		}

		List<Integer> primeNumlist = list.stream().filter
				(i -> isPrime(i)).collect(Collectors.toList());

		primeNumlist.stream().forEach(p-> System.out.println(p));

	}

}
