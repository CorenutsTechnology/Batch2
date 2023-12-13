package com.org.thread6;

public class JoinClass implements Runnable{
	@Override
	public void run() {
		Thread thread1=new Thread(new JoinClass());
		System.out.println(Thread.currentThread().getName());
		System.out.println(thread1.isAlive());
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new JoinClass());
		t1.start();
		t1.join(1000); 
  
        System.out.println("\nJoining after 1000"
                           + " milliseconds: \n"); 
        System.out.println("Current thread: "
                           + t1.getName()); 
  
        // Checks if this thread is alive 
        System.out.println("Is alive? " + t1.isAlive()); 
	}

	
}
