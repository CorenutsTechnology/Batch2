package com.org.thread6;

public class CurrentThreadName implements Runnable {

	@Override
	public void run()
	{
		System.out.println("run method");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Runnable runnab=new CurrentThreadName();
		Thread thread=new Thread(runnab);
		thread.start();
		
	}

}
