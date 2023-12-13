package com.feuji6dec;

public class MainTest 
{
	public static void main(String[] args)
	{
		Threads thread=new Threads("Thread1");
		System.out.println(thread.getName());
		thread.start();
		thread.run();
	//	thread.start(); illegal thread state Exception.
		//System.out.println(Threads.currentThread().getName());
		//ThreadImplementation result=new ThreadImplementation();
		Thread result=new Thread(new ThreadImplementation());
		result.start();
		result.setName("thread1");
		System.out.println(result.getName());
		//Thread result1=new Thread(new ThreadImplementation());
		//result1.start();
		new Thread(new ThreadImplementation()).start();
		new Thread(new ThreadImplementation(),"thread3").start();
		
		
		
		
	}

}
