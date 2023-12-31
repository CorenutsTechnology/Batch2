package com.assignment.nov11;

public class NonPrimeNumbersUsingWhile1 
{
	boolean notPrime(int number)
	{
		int index=2;
		while(index <= (number/2))
		{
			if(number%index==0)
			{
				return true;
			}
			index++;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		NonPrimeNumbersUsingWhile1 nonPrimeNumbers1 = new NonPrimeNumbersUsingWhile1();
		int index=2;
		while(index<=100)
		{
			if(nonPrimeNumbers1.notPrime(index))
			{
				System.out.println(index+" ");
			}
			index++;
		}
	}
}
