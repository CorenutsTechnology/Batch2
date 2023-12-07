package com.crnts.threads;

public class SingleThreadTest {

	public synchronized  static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		SingleThreads thread1 =new SingleThreads("first thread");
		SingleThreads thread2 =new SingleThreads(); //thread name not given
		thread1.start();
		thread2.start();
		
//		Thread first =new Thread(new Task1());
//		first.start();
		
//		------------------or-------------------------------
		Task1 task=new Task1();
		new Thread( task,"one").start();
		new Thread( task,"two").start();
//		new Thread( new Task1(),"third").start();
//		new Thread( new Task1(),"forth").start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				task.customLogic();
				
			}}
			
		).start();
		
//		------------------or------------------------
//		Thread thread =new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				task.customLogic();
//				
//			}});
//		thread.setPriority(Thread.MAX_PRIORITY);
//		thread.start();
		
		
		
		
	}

}
