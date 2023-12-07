package com.crnuts.classes;

public class ImplThread_Q3_Q4 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(10000);
			;
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}
}
