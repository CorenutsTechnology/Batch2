//4. show the behavior of thread by influencing thread functions (sleep, join, yield)

package com.december06;

public class Program4a implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("value: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
