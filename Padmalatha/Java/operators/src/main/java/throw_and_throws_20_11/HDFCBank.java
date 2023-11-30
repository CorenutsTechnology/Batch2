package throw_and_throws_20_11;

import java.util.Scanner;

import throw_and_throws_20_11.interfaces.Bank;

public class HDFCBank implements Bank {

	static double balance = 1000;

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if (amount < 0) {
			System.out.println("Invalid amount to deposit");
		}
		else {
			balance += amount;
           System.out.println("Deposited Successfully");
		}

	}

	@Override
	public void withdraw(double amount) throws InSuficientBalance {
		// TODO Auto-generated method stub
		while (true) {
			if (amount > balance) {
				throw new InSuficientBalance("InSuficient Balance");
			} else {
				balance -= amount;
				System.out.println(amount + " is withdrawed successfully");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Bank bank = new HDFCBank();
		Scanner sc = new Scanner(System.in);

		int k = 0,c=0;
		do {
			System.out.println("1)deposit \n2)withdraw");
			System.out.println("enter your choice");
			k= sc.nextInt();
			switch (k) {
			case 1:
				{System.out.println("Enter the amount to deposit");
				bank.deposit(sc.nextDouble());
				break;}
			case 2:
			{
				System.out.println("Enter the amount to withdraw");

				try {
					bank.withdraw(sc.nextDouble());
					break;
				} catch (InSuficientBalance e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					//3)throw new InSuficientBalance();
					try {
					throw new InSuficientBalance();
					}catch(Exception e1)
					{
						e1.printStackTrace();
					}
				}
			}
			}
		}while(k<=2);
	}

}
