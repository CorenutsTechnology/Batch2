package com.feuji20nov;

public class BankAccountClass  extends RuntimeException implements BankAccount
{
public BankAccountClass(String name)
{
	
}
public BankAccountClass()
{
	
}
	@Override
	public void withdraw(int amount) 
	{
		
		if(amount<=500)
		{
			System.out.println("u can with draw the ammount");
		}
		else
		{
			System.out.println("in suffieciant balance");
			 
		}
		
	}
	
  
}
