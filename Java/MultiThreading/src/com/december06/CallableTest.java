package com.december06;

import java.util.concurrent.FutureTask;

public class CallableTest 
{
	public static void main(String[] args) throws Exception {
		CallableInterface callableInterface = new CallableInterface();
		FutureTask<Object> futureTask	= new FutureTask<>(callableInterface);
		Thread thread = new Thread(futureTask);
		thread.start();
		Object o =futureTask.get();
		System.out.println("returned value is:"+o);
	}
}
