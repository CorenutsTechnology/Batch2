package com.crnuts.testclasses;

import com.crnuts.Interface.UpiApp;
import com.crnuts.impeclass.BankBalanceException;
import com.crnuts.impeclass.GPay;

public class UpiAppTest {

	public static void main(String[] args) {
		String accountNum="944648631540";
		GPay gPay=new GPay();
		gPay.setPinCode(8765);
		gPay.accountNo(accountNum.toCharArray());
		
		gPay.checkBalance(gPay.getPinCode());
		
		try {
			gPay.transferAmmount(50000, 89746, gPay.getPinCode());
		} catch (BankBalanceException e) {
			
			System.out.println(e);
		}
			
			

	}

}
