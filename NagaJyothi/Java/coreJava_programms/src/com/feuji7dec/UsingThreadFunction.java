package com.feuji7dec;

public class UsingThreadFunction  implements Runnable
{

	@Override
	public void run() {
		for(int index=0;index<=10;index++)
		{
			System.out.println(Thread.currentThread().getName()+" "+index);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//			Thread thread=new Thread(new UsingThreadFunction());
//			try {
//				thread.join(10000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			/*
			 * it stops the current executing thread and give chance to the same
			 *  priority thread Thread.yield();
			 */
		}
		
	}
	public static void main(String[] args) 
	{
		UsingThreadFunction function=new UsingThreadFunction();
		Thread thread=new Thread(function);
		thread.start();
		try {
			thread.join(100);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread thread1=new Thread(function);
		thread1.start();
		try {
			thread1.join(100);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread thread2=new Thread(function);
		thread2.start();
		try {
			thread2.join(100);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}

