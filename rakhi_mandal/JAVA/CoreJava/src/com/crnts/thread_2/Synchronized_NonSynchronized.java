//Write a program to show the behavior of synchronized function and non-synchronized function.
package com.crnts.thread_2;

public class Synchronized_NonSynchronized implements Runnable {

	public Synchronized_NonSynchronized() {
		super();
		// TODO Auto-generated constructor stub
	}
  
	@Override
	public   void run() {
		for(int index= 0;index<5;index++)
		{  
			System.out.println(Thread.currentThread().getName()+" job started");

			
		}
	}
		
		public  void custom() {
			for(int index= 0;index<5;index++)
			{  
				System.out.println(Thread.currentThread().getName()+" job custom1");
				
			}
		}
			
			public  void custom2() {
				for(int index= 0;index<5;index++)
				{  
					System.out.println(Thread.currentThread().getName()+" job custom2");
					
				}
		
	
	}
	
  
}
