package com.december06;

public class ThreadCommunication7 
{
	static int amount=100;
	public synchronized void deposit(int money)
	{
		System.out.println("adding amount...");
		amount += money;
		notify();
		System.out.println("money deposited");
	}
	
	public synchronized void withdraw(int money) throws InterruptedException 
	{
		System.out.println("money withdraw started");
		if(money > amount)
		{
			System.out.println("money withdraw paused....");
			wait();
		}
		amount -= money;
		System.out.println("money withdraw done");
	}
	public synchronized void checkBalance()
	{
		System.out.println("balance checking....");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("present amount is: "+ amount);
	}
	public static void main(String[] args) 
	{
		final ThreadCommunication7 object = new ThreadCommunication7();
		 new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					object.withdraw(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				object.checkBalance();
			}
			 
		 }).start();
		 
		 new Thread(new Runnable() {

				@Override
				public void run() {
					object.deposit(1000);
				}
				 
			 }).start();
		 
		 System.out.println("endd");
	}
}
