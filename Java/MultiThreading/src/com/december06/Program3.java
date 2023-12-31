package com.december06;

public class Program3 extends Thread
{
	@Override
	public void run() {
		Thread.yield();
		System.out.println("run method started");
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		System.out.println("run method ended");
	}
	
	
}
