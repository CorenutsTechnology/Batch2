package com.org.thread6;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMethod implements Callable<String> {

	@Override
	public String call() throws Exception {
		
		return "Callable";
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exe=Executors.newSingleThreadExecutor();
		Future<String> future=exe.submit(new CallableMethod());
		String res=future.get();
		System.out.println(res);
		exe.shutdown();
		
	}
	   
}
