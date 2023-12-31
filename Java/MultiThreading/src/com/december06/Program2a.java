package com.december06;

public class Program2a extends Thread
{
	public void run()
	{
		System.out.println("current thread: "+Thread.currentThread().getName());
		for(int i=0;i<10;i++)
		{
			System.out.println("value: "+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
