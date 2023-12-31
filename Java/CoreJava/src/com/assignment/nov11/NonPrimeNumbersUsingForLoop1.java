package com.assignment.nov11;

public class NonPrimeNumbersUsingForLoop1 {

	boolean notPrime(int number)
	{
		
		for(int index=2;index <= (number/2);index++)
		{
			if(number%index==0)
				return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		NonPrimeNumbersUsingForLoop1 nonPrimeNumbers1 = new NonPrimeNumbersUsingForLoop1();
		for(int index =2 ;index<=100 ;index++)
		{
			if(!nonPrimeNumbers1.notPrime(index))
			{
				System.out.println(index+" ");
			}
			
		}
	}

}
