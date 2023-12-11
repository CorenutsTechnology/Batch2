package com.crnuts.interfaces;

public class PrimeNo {

	public boolean isPrinme(int num) {
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

}
