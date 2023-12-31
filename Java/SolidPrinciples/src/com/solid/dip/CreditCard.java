package com.solid.dip;

public class CreditCard implements BankCard
{
	public void doTransaction(long amount)
	{
		System.out.println("paying using credit card");
	}
}
