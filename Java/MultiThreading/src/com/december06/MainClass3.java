package com.december06;

public class MainClass3 
{
	public static void main(String[] args) 
	{
		Program3 object = new Program3();
		Thread thread = new Thread(object);
		thread.start();
		new Thread(thread).start();
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
