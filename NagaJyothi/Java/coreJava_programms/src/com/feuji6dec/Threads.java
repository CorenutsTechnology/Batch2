package com.feuji6dec;

public class Threads extends Thread 
{
	public Threads()
	{
		
	}
	public Threads(String string)
	{
		System.out.println(Thread.currentThread().getName());
	}
	@Override
	public void run()
	{
		System.out.println("run method");
	}
    public void display()
    {
    	System.out.println("");
    }
}
