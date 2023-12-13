package com.feuji7dec;

public class RunnableInterface  implements Runnable
{

	@Override
	public void run() {
		// Set the name to thread....
		Thread t=new Thread();
		t.setName("Thread-1");
		System.out.println(Thread.currentThread().getName());
		System.out.println("Runnable interface");
		
	}
	

}
