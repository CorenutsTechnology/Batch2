//Write a program to create thread using thread class and Runnable interface.
package com.crnts.thread_2;

public class CreateThreadWithRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" job started in Runnable Interface");
		
		
	}

}
