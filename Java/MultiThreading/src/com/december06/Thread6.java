package com.december06;

public class Thread6 implements Runnable {

	@Override
	public synchronized void run() 
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}

}
