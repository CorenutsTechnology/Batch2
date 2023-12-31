package com.december05;

public class ThreadThree implements Runnable
{

	@Override
	public synchronized void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("value: "+i);
		}
	}
	
	public void helper()
	{
		run();
		customLogic();
	}
	
	public  static synchronized void customLogic()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("in custom logic method: "+i);
		}
	}
}
