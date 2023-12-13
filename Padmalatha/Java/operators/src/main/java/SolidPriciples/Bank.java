package SolidPriciples;

public abstract class Bank {

	public void deposit()
	{
		System.out.println("Amount deposited");
	}
	public abstract void withdraw();
	
}
class BankDeposit
{
	public void deposit()
	{
		System.out.println("Amount deposited");
	}
}
class BankWithDraw
{
	public void withdraw()
	{
		System.out.println("Amount Withdrawed");
	}
}