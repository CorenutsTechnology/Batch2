package com.org.thread6;

public class ThreadCommunication {

	int amount=10000;    
    
	public synchronized void withdraw(int amount){    
	System.out.println(" withdraw");    
	    
	if(this.amount<amount){    
	System.out.println("Less balance,please deposit");    
	try{
		wait();
		}
	catch(Exception e){
		System.out.println("handled");
		}    
	}    
	this.amount-=amount;    
	System.out.println("withdraw completed");    
	}    
	    
	synchronized void deposit(int amount){    
	System.out.println("deposit amount");    
	this.amount+=amount;    
	System.out.println("deposit completed ");    
	notify();    
	}       
	        
	public static void main(String args[]){    
	ThreadCommunication c=new ThreadCommunication();    
	new Thread(){    
	public void run()
	{c.withdraw(15000);}    
	}.start();    
	new Thread(){    
	public void run(){c.deposit(10000);}    
	}.start();    

}
}