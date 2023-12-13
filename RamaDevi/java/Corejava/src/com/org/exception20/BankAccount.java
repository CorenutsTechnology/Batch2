package com.org.exception20;

public class BankAccount implements Account {

public void deposit(double amount) throws MoreBalance
	{
	double balance=0;
		if(amount<=5000)
	    {
			
			 balance=balance+amount;
				 System.out.println("Total balance is:"+balance);
				 System.out.println(balance+"credited to your account");
		}
		else
		{
	throw new MoreBalance();
		}
	}
	public void withdraw(double amount) throws InsufficientBalance
	{
	double balance=1000;
	if(balance<=amount)
	{
	balance=balance-amount;
	System.out.println(amount+"withdrawn");
	}
	else
	{
		throw new InsufficientBalance("lessbalance is their");
	}
	}
	public static void main(String[] args)   {
		BankAccount bankaccount=new BankAccount();
		
		try {
			bankaccount.deposit(8000);
		} catch (MoreBalance e) {
			
			e.printStackTrace();
		}
		
		try {
			bankaccount.withdraw(600);
		} catch (InsufficientBalance e) {
			
			e.printStackTrace();
			//System.out.println(e.message);
			
		}
		

	}

}
