package com.december05;

public class ThreadOne extends Thread
{
	public void run()
	{
		System.out.println("current thread: "+Thread.currentThread().getName());
		for(int i=0;i<10;i++)
		{
			System.out.println("value: "+i);
		}
	}
}
