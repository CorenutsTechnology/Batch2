package com.december06;

public class Program4c 	extends Thread
{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}

}
