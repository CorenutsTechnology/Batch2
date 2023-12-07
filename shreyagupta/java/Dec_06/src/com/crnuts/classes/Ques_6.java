package com.crnuts.classes;

public class Ques_6 extends Thread {

	@Override
	public void run() {

		try {
			Thread.sleep(1000);
			for (int i = 1; i <= 100; i++) {
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}
}
