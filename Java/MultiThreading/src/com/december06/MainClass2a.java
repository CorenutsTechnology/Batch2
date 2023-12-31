package com.december06;

public class MainClass2a {
	public static void main(String[] args)
		{
			System.out.println("thread name in main is: "+Thread.currentThread().getName());
			Program2a thread = new Program2a();
			thread.start();
			for(int i=0;i<10;i++)
			{
				System.out.println("main: "+i);
			}
			
		}
}

