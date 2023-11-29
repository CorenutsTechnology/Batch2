package com.crnuts.Interface;

import com.crnuts.impeclass.BankBalanceException;

public interface UpiApp {

	void checkBalance(int pin ) ;
	void transferAmmount(int bankBalance,int transferAmt, int pin) throws BankBalanceException;
	
	
}
