package com.crnuts.impeclass;

import com.crnuts.Interface.UpiApp;

public class GPay implements UpiApp {
	private int pinCode;
	private int bankBalance;

	public GPay() {

	}

	@Override
	public void checkBalance(int pin) {
		if (pin == pinCode) {
			System.out.println("Total account balance: " + bankBalance);
		} else {
			System.out.println("Enter valid pin");
		}
	}

	@Override
	public void transferAmmount(int bankBalance, int transferAmt, int pin) throws BankBalanceException {
		if (bankBalance >= transferAmt) {
			bankBalance = bankBalance - transferAmt;
		} else {

			throw new BankBalanceException("Bank balance can't be nigative");
		}
	}
	
	public void accountNo(char[] accNO) {
		if(accNO.length==10) {
			System.out.println("correct Account Number");
		}
		else {
			try {
               System.out.println(accNO[accNO.length]);
			
			} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Account number can't be of "+accNO.length+" digits");
		}
		
	}
	}
	

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}

}
