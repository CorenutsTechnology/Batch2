//Write a program to show the behavior of synchronized function and non-synchronized function.
package com.crnts.thread_2;

public class Synchronized_NonSynchronized_Test {

	public static void main(String[] args) {
		Synchronized_NonSynchronized_Test test = new Synchronized_NonSynchronized_Test();
		test.threadShow();
	}

	public void threadShow() {
		Synchronized_NonSynchronized thread = new Synchronized_NonSynchronized();
//		new Thread(thread, "one").start();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				thread.custom();
				thread.custom2();
			}
		});

		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				thread.custom();
				thread.custom2();
			}
		});

		thread2.start();

	}

}
