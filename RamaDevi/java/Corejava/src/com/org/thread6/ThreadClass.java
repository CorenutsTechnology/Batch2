package com.org.thread6;

public class ThreadClass extends Thread {
	
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("first Thread"+i);
		}
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadClass threadObj=new ThreadClass();
		Thread t1=new Thread();
		threadObj.start();
		//Runnable interface
		Runnable r2=new RunnableClass();
		Thread t2=new Thread(r2);
		t2.start();
		//dirctly pass
		Thread t3=new Thread(new RunnableClass());
		t3.start();
		
	}

}
