package com.december06;

public class MainClass4b 
{
	public static void main(String[] args) throws InterruptedException {
		Program4b obj = new Program4b();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		t1.setPriority(1);
		t2.setPriority(1);
		
		t1.start();
		t1.join();
		
		t2.start();
//		t2.join();
		
//		t3.start();
	}
}
