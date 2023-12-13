package com.org.thread6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {
	int number;

	public ThreadPool(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("number  " + number + Thread.currentThread().getName());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 1; i <= 10; i++) {
			ThreadPool runs = new ThreadPool(i);
			executorService.submit(runs);
		}

		executorService.shutdown();
	}

}
