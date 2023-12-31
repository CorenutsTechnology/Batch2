//2. Write a program to raise the user defined exception based on user condition from try
//block?

package com.exception2.nov20;

import java.util.Scanner;

public class CustomException2 implements BankInterface{

	static int amount=900;
	Scanner sc = new Scanner(System.in);
	public void deposit()
	{
		System.out.println("Enter amount to deposit");
		int amt=sc.nextInt();
		amount += amt;
		System.out.println("amount is deposited and current balance is: "+amount);
	}
	 
	public void withDraw() throws InsufficientBalance
	{
		System.out.println("Enter amount to withdraw");
		int amt=sc.nextInt();
		System.out.println("amount: "+amount+"amt: "+amt);
		if(amount<amt)
		{
			
			throw new InsufficientBalance("you have entered Insufficient Balance ");
		}
		else {
			amount -= amt;
			System.out.println(amt+"  withdraw is successful... \nRemaining amount is "+amount);
		}
	}
	public static void main(String[] args) 
	{
		CustomException2 customException2 = new CustomException2();
		customException2.deposit();
		try {
			customException2.withDraw();
		}catch(InsufficientBalance e)
		{
			System.out.println(e);
		}
	}
}
