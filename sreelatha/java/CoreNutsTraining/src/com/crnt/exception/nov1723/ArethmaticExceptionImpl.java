package com.crnt.exception.nov1723;

public class ArethmaticExceptionImpl implements ArethmaticException, HandleExceptionByTryAndCatch {
	ArethmaticExceptionImpl a = new ArethmaticExceptionImpl();

	@Override
	public int division() {

		System.out.println("---------------------");
		int divi = 0;
		try {
			divi = 10 / 2;
			a.ArrayIndexOBException();

		} catch (Exception e) {
			System.out.println("Armatic exception will be handled");
		}

		return divi;

	}

	@Override
	public int ArrayIndexOBException() {
		int[] arr = new int[] { 2, 3, 45, 67, 8 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[5]);

		}
		return 0;
	}

}
