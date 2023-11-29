package oops_21_11;

import java.util.Scanner;

public class HDFCBank implements Bank{

	private double balance=10000;
   
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount<0)
		{
			System.out.println("Please deposit positive amount only");
	
		}
		else
		{
			balance+=amount;
			System.out.println("Amount deposited successfully");
		}
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>balance||amount<0)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			balance-=amount;
			System.out.println("Amount withdrawed Successfully");
			
		}
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		HDFCBank hDFCBank=new HDFCBank();
		hDFCBank.getBalance();
	}

	public static void main(String[] args) {
		
		HDFCBank hDFCBank=new HDFCBank();
		int k=0;
		double amount=0;
		Scanner scanner=new Scanner(System.in);
		
		do {
			 System.out.println("1)deposit\n2)withdraw\n3)checkBalance");
			 System.out.println("Enter your choice");
			 k=scanner.nextInt();
			 switch(k) {
			  case 1:{
				       System.out.println("Enter the Amount to deposit");
				       amount=scanner.nextDouble();
				       hDFCBank.deposit(amount);
				       break;
			  }
			  case 2:{
				  System.out.println("Enter the Amount to withdraw");
			       amount=scanner.nextDouble();
			       hDFCBank.withdraw(amount);
			       break;
			  }
			  case 3:{
				  System.out.println("Balance:"+hDFCBank.getBalance());
			  }
			 }
		}while(k<4);
	}
}
