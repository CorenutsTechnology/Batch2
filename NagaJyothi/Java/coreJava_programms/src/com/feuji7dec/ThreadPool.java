package com.feuji7dec;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool 
{
	public static void main(String[] args) 
	{
		ExecutorService service= Executors.newFixedThreadPool(5);
		PrintNumbers numbers=new PrintNumbers();
		PrintNumbers numbers1=new PrintNumbers();
		PrintNumbers numbers2=new PrintNumbers();
		service.submit(numbers);
		service.submit(numbers1);
		service.submit(numbers2);
		 boolean s=service.isTerminated();
		 System.out.println(s);
		service.isShutdown();
//		Future future=service.submit(numbers);
//		System.out.println(future);
		
	}

}
