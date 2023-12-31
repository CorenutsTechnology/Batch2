package com.solid.dip;

public class DebitCard implements BankCard{
	public void doTransaction(long amount)
	{
		System.out.println("paying using debit card");
	}
}
