//Write a program to show the thread communication from one thread to another thread.
package com.crnts.thread_2;

public class CommunicationTest {

	public static void main(String[] args) {
		Communication c=new Communication();    
		new Thread(){    
		public void run(){c.withdraw(1533);}    
		}.start();    
		new Thread(){    
		public void run(){c.deposit(100000);}    
		}.start();    

	}

}
