package com.crnts.threads;

public class Task1 implements Runnable {
	
	private static int counter;
	

	public int getCounter() {
		return counter;
	}


	public void setCounter(int counter) {
		this.counter = counter;
	}


	public Task1() {
	}


	public Task1(int counter) {
		super();
		this.counter = counter;
	}


	@Override
	public  synchronized void  run() {
		// TODO Auto-generated method stub
		for(int index= 0;index<5;index++)
		{   counter++;
			System.out.println(Thread.currentThread().getName()+" job started");
			
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
	public static  void  customLogic()
	{
		for(int index=0;index<5;index++)
		{
			counter++;
			System.out.println(Thread.currentThread().getName()+" custom job started");
			
		}
	}

}
