package com.cnts.nov20;

public class CustomException2 
{
	double balance=2000;
	
	public void withdraw(double amount) throws Exception
	{
		if(balance<amount)
		{                 
			throw new BalanceInsufficentException2("Insufficent Balance: "+balance);
		}
	}
	
	public static void main(String[] args) {
		CustomException2 exception2 = new CustomException2();
		try 
		{
			exception2.withdraw(10000);
		} 
		catch (Exception e) {
			System.out.println("Exception Occured");
		}
	}
}
