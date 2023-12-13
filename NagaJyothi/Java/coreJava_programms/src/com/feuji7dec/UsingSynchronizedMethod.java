package com.feuji7dec;

public class UsingSynchronizedMethod implements Runnable {
	@Override
	public void run() {
		displayNumbers();
		//caluclate();

//		for(int index=0;index<=10;index++)	
//		{
//			System.out.println(Thread.currentThread().getName()+" "+index);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}

	public synchronized void displayNumbers() {
		for (int index = 0; index <= 10; index++) {
			System.out.println(Thread.currentThread().getName() + " " + index);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	/*
	 * public synchronized void caluclate() {
	 * System.out.println("caluclate method"); }
	 */

	public static void main(String[] args) {
		UsingSynchronizedMethod u1 = new UsingSynchronizedMethod();
		UsingSynchronizedMethod u2 = new UsingSynchronizedMethod();
		Thread thread1 = new Thread(u1);
		thread1.start();
		Thread thread2 = new Thread(u2);
		thread2.start();

	}

}
