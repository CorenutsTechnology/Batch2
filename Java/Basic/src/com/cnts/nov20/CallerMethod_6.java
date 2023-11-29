package com.cnts.nov20;

public class CallerMethod_6
{
	
	public static void main(String[] args) {
		CallerMethod_6 method = new CallerMethod_6();
		try {
			method.eligeble(0);
		}
		catch (Exception e) {
			System.out.println("Caller method");
		}
	}
	 public void eligeble(int age) throws Exception
	 {
		 if(age<18 )
			 throw new EligableException("Not Eligable for voting");
		 else
			 System.out.println("Eligable for voting..");
	 }
}
