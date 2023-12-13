package com.feuji7dec;

public class TestTheThreadImplementation 
{
	public static void main(String[] args)
	{
		Threads threads=new Threads();
		threads.start();
		
		Thread thread=new Thread(new RunnableInterface());
		thread.start();
		System.out.println("Thread name-"+thread.currentThread().getName());
		
		
	}

}
