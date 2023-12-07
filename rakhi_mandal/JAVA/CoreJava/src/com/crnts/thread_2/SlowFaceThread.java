//Write a program to display 1 to 100 values while executing thread job in slow face.
package com.crnts.thread_2;

public class SlowFaceThread implements Runnable {

	@Override
	public void run() {
		for(int index= 0;index<100;index++)
		{   
			
			System.out.println(index);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	}

	

}
