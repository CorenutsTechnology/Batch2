//Write a program to display current thread name.
package com.crnts.thread_2;

public class ThreadName {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" job started");
		ThreadName threadName=new ThreadName();
		threadName.nameThread();
		
	}
	
	public void nameThread() 
	{
		CreateThread thread=new CreateThread("thread_In_Method");
		thread.start();
		}

}
