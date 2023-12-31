package com.assignment.nov11;

public class NonPrimeNumbersUsingDoWhile1 
{
	boolean notPrime(int number)
	{
		if(number==0)
		{
			return false;
		}
		if(number<2)
		{
			//not a prime
			return true;
		}
		if(number == 2 || number == 3)
		{
			//it is prime
			return false;
		}
		if(number %2 == 0 || number %3 ==0)
		{
			//not a prime
			return true;
		}
		int index=2;		
		do{
			if(number%index==0)
			{
				return true;
			}
			index++;
		}while(index <= (number/2));
		return false;
	}
	public static void main(String[] args) 
	{
		NonPrimeNumbersUsingDoWhile1 nonPrimeNumbers1 = new NonPrimeNumbersUsingDoWhile1();
		int index=0;
		
		do{
			if(nonPrimeNumbers1.notPrime(index))
			{
				System.out.println(index+" ");
			}
			index++;
		}while(index<=100);
	}
}
