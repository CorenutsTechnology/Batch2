package com.feuji7dec;

public class PrintNumbers implements Runnable 
{

	@Override
	public void run() {
		for(int index=0;index<=10;index++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	

}
