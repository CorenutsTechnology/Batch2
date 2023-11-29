package com.ass.flowcontrol;

public class NonPrimeNumber {

	public static void main(String[] args) {
		int num=100;
		for(int number=1;number<=num;number++) {
			if(!isPrime(number)) {
				System.out.println(number);
			}
		}

	}
	
	public static boolean isPrime(int num) {
		int count=0;
		
		for(int number=1;number<=num;number++) {
			if(num%number==0) {
				count++;
			}
		}
		return count==2;
	}

}
