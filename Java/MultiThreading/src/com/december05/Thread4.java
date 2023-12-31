package com.december05;

public class Thread4 implements  Runnable 
{	
	public void run() 
	{
		try {
			System.out.println("waiting............");
			wait(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
