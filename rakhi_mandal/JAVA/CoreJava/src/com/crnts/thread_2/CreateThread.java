//Write a program to create thread using thread class and Runnable interface.
package com.crnts.thread_2;

public class CreateThread extends Thread {
	
	public CreateThread()
	{
		super();
	}
	
	public CreateThread(String name)
	{
		super(name);
	}
	@Override
	public   void run () {
		System.out.println(Thread.currentThread().getName()+" job started");
	}

	

}
