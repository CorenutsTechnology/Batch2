//4. show the behavior of thread by influencing thread functions (sleep, join, yield)
//---->join
package com.december06;

public class Program4b implements Runnable
{
	static int count =0;

	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<2;i++)
		{
			System.out.println(count++);
		}
		
	}
	
}
