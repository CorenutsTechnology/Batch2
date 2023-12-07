//Write a program to create thread using thread class and Runnable interface.
package com.crnts.thread_2;
public class CreateThreadTest {

	public static void main(String[] args) {
		CreateThreadTest test =new CreateThreadTest();
		test.usingThreadClass();
		test.usingRunnableInterface();
		
//		Thread first =new Thread(new Task1());
//		first.start();
	}
	public void usingThreadClass()
	{
		System.out.println(Thread.currentThread().getName());
		CreateThread thread1 =new CreateThread("first thread");
		CreateThread thread2 =new CreateThread(); //thread name not given
		thread1.start();
		thread2.start();
		
	}
	public void usingRunnableInterface()
	{
		CreateThreadWithRunnable thread=new CreateThreadWithRunnable();
		new Thread( thread,"one").start();
		
		
	}

}
