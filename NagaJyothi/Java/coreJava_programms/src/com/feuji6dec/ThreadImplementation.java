package com.feuji6dec;

public class ThreadImplementation implements Runnable
{

	@Override
	public void run() 
	{
		Thread t=new Thread();
		t.setName("Thread-1");
		System.out.println("thread class implemented by runnable interface");
		
	}
	

}
