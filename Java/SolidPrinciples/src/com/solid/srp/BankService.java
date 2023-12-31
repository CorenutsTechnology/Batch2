package com.solid.srp;

public class BankService
{
	public void getLoan(String loanType)//loan class
	{
		if(loanType.equals("homeloan"))
			System.out.println("homeloan");
		if(loanType.equals("personalLoan"))
			System.out.println("personalLoan");
		if(loanType.equals("car"))
			System.out.println("car");
	}
	
	public void sendOtp(String medium)//notification class
	{
		if(medium.equals("email"))
		{
			//code....
		}
			
		if(medium.equals("phone Number"))
		{
			//code....
		}	
	}
}
