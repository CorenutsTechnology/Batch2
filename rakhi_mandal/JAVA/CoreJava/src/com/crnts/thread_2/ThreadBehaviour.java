//show the behavior of thread by influencing thread functions (sleep, join, yield)
package com.crnts.thread_2;

public class ThreadBehaviour {

	public static void main(String[] args) {
		ThreadBehaviour threadBehaviour =new ThreadBehaviour();
//		threadBehaviour.sleepThread();
		threadBehaviour.yeildThread();
	}
	public void sleepThread()
	{
		ThreadBehaviour_P4 thread=new ThreadBehaviour_P4("first thread");
		thread.start();
		thread.run();
	}
	
	public void yeildThread()
	{
		ThreadBehaviour_P4 thread=new ThreadBehaviour_P4("first thread");
//		thread.yield();
		thread.start();
	}
	}


