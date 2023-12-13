package com.feuji7dec;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableAndCollable  implements Callable<String>
{

	@Override
	public String call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		return "Hello";
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		ExecutorService service=Executors.newFixedThreadPool(2);
		Future<String> future1=service.submit(new RunnableAndCollable());
		Future<String> future2=service.submit(new RunnableAndCollable());
		Future<String> future3=service.submit(new RunnableAndCollable());
		String value1=future1.get();
		String value2=future1.get();
		String value3=future1.get();
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
			
			
		


		
		
	}
	

}
