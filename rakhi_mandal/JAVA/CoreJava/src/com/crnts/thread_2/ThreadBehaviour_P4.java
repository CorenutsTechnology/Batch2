//show the behavior of thread by influencing thread functions (sleep, join, yield)
package com.crnts.thread_2;

public class ThreadBehaviour_P4 extends Thread {
	public ThreadBehaviour_P4()
	{
		super();
	}
	public ThreadBehaviour_P4(String name)
	{
		super(name);
	}
	
	@Override
	public   void run () {
		
//		for(int index=0;index<5;index++)
//		{
			System.out.println("printing");
		
		
		try {
			
			Thread.sleep(1000);
			System.out.println("printing  sleep");
			Thread.yield();
			System.out.println("printing yield");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}
	
	

