package com.crnuts.classes;

public class ImplRunable_Q2 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i < 5; i++) {

			System.out.println("Thread name: " + Thread.currentThread().getName());
			System.out.println("Thread ID: " + Thread.currentThread().getId());
			System.out.println("Thread priority: " + Thread.currentThread().getPriority());

		}

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
