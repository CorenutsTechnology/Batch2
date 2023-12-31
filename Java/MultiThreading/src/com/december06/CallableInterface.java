package com.december06;

import java.util.concurrent.Callable;

public class CallableInterface implements Callable<Object>
{

	@Override
	public Object call() throws Exception 
	{
		System.out.println(Thread.currentThread().getName());
		return "hello";
	}
	
}
