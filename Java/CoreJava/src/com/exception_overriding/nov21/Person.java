package com.exception_overriding.nov21;

import java.util.Scanner;

public class Person extends Bank2
{
	static int amount;
	Scanner sc = new Scanner(System.in);

	@Override
	void deposit() {
		System.out.println("Enter amount to deposit");
		int amt=sc.nextInt();
		amount += amt;
		System.out.println("amount is deposited and current balance is: "+amount);
	}
	 
	@Override
	void withdraw() {
		System.out.println("Enter amount to withdraw");
		int amt=sc.nextInt();
		if(amount<amt)
		{
			
			System.out.println("you have entered Insufficient Balance ");
		}
		else {
			amount -= amt;
			System.out.println(amt+"  withdraw is successful... \nRemaining amount is "+amount);
		}
	}
	public static void main(String[] args) 
	{
		Bank2 bank = new  Person();
		bank.deposit();
		bank.withdraw();
	}

	

}
