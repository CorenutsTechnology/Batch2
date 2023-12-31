//8. Write a program to create thread pool and usage of the threads 
//(execution of the job using thread) from pool.
package com.december06;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool8 implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<3;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ----- "+i);
		}
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("main method started hutb");
		
		ExecutorService pool = Executors.newFixedThreadPool(4);
		
		ThreadPool8 thread = new ThreadPool8();
		for(int i=0;i<7;i++)
		{
			pool.execute(new Thread(thread));
		}
		
		pool.shutdown();
	}
	
}
