package com.december05;

public class MainClass3
{
	public static void main(String[] args) 
	{
		ThreadThree threadThree = new ThreadThree();
			
//		new Thread(threadThree).start();
//		
//		new Thread(threadThree).start();
//		
		new Thread(new Runnable() {

			@Override
			public void run()
			{
				threadThree.helper();
			}
			
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run()
			{
				threadThree.helper();
			}
			
		}).start();
	}
	/*
	 * Can we call thread start () twice?
		No. After starting a thread, it can never be started again. If you does so, an
		 IllegalThreadStateException is thrown. In such case, thread will run once but for second time, it will throw exception
	 */
}
