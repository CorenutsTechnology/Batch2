package com.december06;

public class MainClass4c 
{
	public static void main(String[] args) throws InterruptedException 
	{
		int i =0;
		Program4c obj = new Program4c();
		Program4c obj2 = new Program4c();
		obj.setPriority(1);
		obj2.setPriority(7);
		obj.start();
		
		obj2.start();
		
		for(i=0;i<2;i++)
		{
			obj.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
}
