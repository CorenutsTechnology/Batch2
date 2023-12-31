package com.december05;

public class MainClass1 {
	public static void main(String[] args)
	{
		System.out.println("main method: "+Thread.currentThread().getName());
		ThreadOne thread = new ThreadOne();
		thread.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main: "+i);
		}
		
	}
}
