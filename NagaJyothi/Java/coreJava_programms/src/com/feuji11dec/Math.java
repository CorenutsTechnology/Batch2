package com.feuji11dec;

public class Math {

	
	public  int sum(int value1, int value2) {
		int result = value1 + value2;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

		Math result = new Math();
		int sum = result.sum(10, 20);
	}

}
