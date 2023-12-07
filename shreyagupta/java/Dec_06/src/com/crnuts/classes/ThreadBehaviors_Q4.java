package com.crnuts.classes;

public class ThreadBehaviors_Q4 extends Thread {
	
	@Override
	public void run() {
		System.out.println("This code is running in Thread");
	}

	public void sleepBehaviour() {

		try {
			System.out.println("This code is running in sleep()");
			Thread.sleep(5452257);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void joinBehaviour() {

		try {
			System.out.println("This code is running in join()");
			Thread thread = new Thread();
			thread.join(5452257);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void yieldBehaviour() {
		System.out.println("This code is running in yield()");
		Thread.yield();

	}

}
