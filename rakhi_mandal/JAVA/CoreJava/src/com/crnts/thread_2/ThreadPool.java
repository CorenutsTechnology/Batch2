//Write a program to create thread pool and usage of the threads (execution of the job using thread) from pool.
package com.crnts.thread_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
  public static void main(String[] args) {
	ExecutorService executorService=  Executors.newFixedThreadPool(9);
	for(int index=0;index<9;index++)
	{
		executorService.submit(new CreateThread("id:"+index));
	}
}
}
