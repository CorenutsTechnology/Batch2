package com.feuji7dec;

public class Threads   extends  Thread
{

	@Override
	public void run() {
		for(int index=1;index<=10;index++)
		{
			//System.out.println(Thread.currentThread()+" "+index);
			System.out.println(index);
		}
		
	}
	
	

}
