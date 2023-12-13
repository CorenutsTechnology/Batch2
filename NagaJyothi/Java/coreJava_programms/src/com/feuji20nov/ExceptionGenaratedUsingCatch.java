package com.feuji20nov;

public class ExceptionGenaratedUsingCatch  
{
		public ExceptionGenaratedUsingCatch() {
		// TODO Auto-generated constructor stub
	}
	 BankAccountClass result1=new BankAccountClass();
	//ExceptionGenaratedUsingCatch result2=new ExceptionGenaratedUsingCatch();
	
	public void check() throws BankAccountClass
	{
		int value1=10;
		int value2=0;
		try
		{
			int c=value1/value2;
			System.out.println(c);	
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic exception occured");
			/*
			 * try {
			 */
				result1.withdraw(40000);
				throw new BankAccountClass("BankAccount exception occured");
				//throw e;
				
				/*
				 * } catch (BankAccountClass exception) {
				 * System.out.println("BankAoount Exception occured");
				 * 
				 * }
				 */
			
		}
		
	}
	public static void main(String[] args) 
	{
		ExceptionGenaratedUsingCatch result2=new ExceptionGenaratedUsingCatch();
	
       try {
    	   result2.check();
	} catch (Exception e) {
		System.out.println("Exception handled");
		e.printStackTrace();
	}
	}
}
