package Exception2;

import com.cnts.operator.ArthematicalOperator;

public class AndhraBank  implements Bank{
	static double balance=10000;
	public static void main(String[] args) {
		AndhraBank andhraBank=new AndhraBank();
		//andhraBank.checkBalance();
		andhraBank.withdraw(80000);
		andhraBank.deposite(1000);
		
	}

	@Override
	public void withdraw( int amount) {
		try {
		if(amount> balance) {
			throw new InsuffiaciantBalance("you have insuffieant balance");
		}
		else {
			System.out.println("Your Transaction is successfull");
		}
			
		}
		finally {
			System.out.println("Thank you......");
		}
		
		
	}

	@Override
	public void checkBalance(int amount) {
		balance=balance-amount;
		System.out.println("your current balance"+balance);
		
		
	}

	@Override
	public void deposite(int deposit) {
		try {
			if(deposit<50000) {
				System.out.println(10/0);
			}
		}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				 throw new ExceedDepositeLimit("your amount is Exceed from Deposit");
				 
				
			}
		}
		
	}


