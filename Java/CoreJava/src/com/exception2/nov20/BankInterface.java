package com.exception2.nov20;

public interface BankInterface 
{
	void withDraw() throws InsufficientBalance;
	void deposit();
}
