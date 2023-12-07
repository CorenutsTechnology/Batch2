//Write a program to show the thread communication from one thread to another thread.
package com.crnts.thread_2;

public class Communication {
	int amount=400000000;    
    
	synchronized void withdraw(int amount){    
	System.out.println("withdraw started");    
	    
	if(this.amount<amount){    
	System.out.println("Less balance,pls deposit");    
	try{
		wait();
		}catch(Exception e){}    
	}    
	this.amount-=amount;    
	System.out.println("withdraw done");    
	}    
	    
	synchronized void deposit(int amount){    
	System.out.println("going to deposit");    
	this.amount+=amount;    
	System.out.println("deposit completed");    
	notify();    
	}   
}
