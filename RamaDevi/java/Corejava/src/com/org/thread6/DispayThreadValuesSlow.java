package com.org.thread6;

public class DispayThreadValuesSlow implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=100;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Runnable r1	=new DispayThreadValuesSlow();
		Thread t1=new Thread(r1);
		t1.start();
		
	}

	

}
