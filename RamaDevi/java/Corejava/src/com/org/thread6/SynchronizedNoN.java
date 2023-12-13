package com.org.thread6;

public class SynchronizedNoN implements Runnable{
//	@Override
//	public synchronized void  run()
//	{
//		for(int i=0;i<=10;i++)
//		{
//			System.out.println(i);
//		}
//		System.out.println(Thread.currentThread().getName());
//	}
	public  void  run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);	
		}
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Runnable synObj=new SynchronizedNoN();
		Thread t1=new Thread(synObj);
		t1.start();
		synObj.run();
	}

}
