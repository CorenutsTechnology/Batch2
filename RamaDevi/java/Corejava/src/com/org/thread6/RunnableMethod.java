package com.org.thread6;

public class RunnableMethod implements Runnable {
	@Override
	public void run() {
		System.out.println("runnable");
	}
	
	public static void main(String[] args) {
		 Thread thread = new Thread(new RunnableMethod());
	        thread.start();
	}

	

}
