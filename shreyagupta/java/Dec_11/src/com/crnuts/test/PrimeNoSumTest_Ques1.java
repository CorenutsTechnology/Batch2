package com.crnuts.test;


import com.crnuts.interfaces.PrimeNo;
import com.crnuts.interfaces.PrimeNoSum_Ques1;

public class PrimeNoSumTest_Ques1 {
	public static void main(String[] args) {
		PrimeNo primeno = new PrimeNo();
		PrimeNoSum_Ques1 noSum = (range1, range2) -> {
			int sum = 0;
			for (int value = range1; value <= range2; value++) {
				if (primeno.isPrinme(value)) {
					sum = sum + value;
				}

			}
			System.out.println("sum of prime no b/w range: " + sum);
			return sum;
		};

		noSum.sum(3, 7);
	}

}
