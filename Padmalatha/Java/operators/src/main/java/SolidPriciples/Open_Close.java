package SolidPriciples;

import interfaces_16_9.Bank;

public class Open_Close {
	
   public static void main(String[] args) {
	   
	SBIBank s=new SBIBank();
}	

}
abstract class Bank1 {

	public void deposit()
	{
		System.out.println("Amount deposited");
	}
	public void withdraw()
	{
		System.out.println("Amount withdrawed");
	}
	
}
class SBIBank extends Bank1{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Amount deposited in SBIBank");
	}
	
	public void withdraw()
	{
		System.out.println("Amount withdrawed");
	}
	
	public void interst()
	{
		System.out.println("SBI interst");
	}
	
}