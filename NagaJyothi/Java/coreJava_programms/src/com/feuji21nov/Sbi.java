package com.feuji21nov;

import java.util.Scanner;

public class Sbi implements Bank
{
 private double balance=20000;
 

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

@Override
public void deposit(int amount) {
	if(amount<0)
	{
		System.out.println("deposit +ve numbers");
	}
	else
	{
		balance=balance+amount;
		System.out.println("Total balance is :"+balance);
	}
	
}

@Override
public void withdraw(int amount) {
	if(amount>balance)
	{
		System.out.println("in sufficient balance in ur account");
	}
	else
	{
		System.out.println("Sucessfully with draw the amount u want"+amount);
		balance=balance-amount;
		System.out.println("Remaining balance:"+balance);
	}
	
}
public static void main(String[] args) 
{
	
	Scanner scan=new Scanner(System.in);
	Sbi result=new Sbi();
	int choice;
	do
	{
		System.out.println("1.deposit");
		System.out.println("2.with draw");
		System.out.println("Enter ur choice");
		choice=scan.nextInt();
	  
		switch(choice)
		{
		case 1:System.out.println("Enter amount u want to dposit:");
		       result.deposit(scan.nextInt());
		break;
		case 2: System.out.println("Enter amount u want to with draw");
		        result.withdraw(scan.nextInt());
		break;
		default:System.out.println("Enter correct choice:");
		break;

	  }
	} while(choice<3);
	
	
		
}
 
	

}
