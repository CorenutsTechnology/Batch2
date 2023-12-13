package com.org.flowcontrol10;

public class NonPrimeMain {

	public static void main(String[] args) {
		NonPrimmeNumbers nonPrimmeNumbers=new NonPrimmeNumbers();
		
		int startRange=1;
		int  endRange=100;
		for(int value=startRange;value<=endRange;value++)
		{
			if(!(nonPrimmeNumbers.isPrime(value)))
			{
				System.out.println(value);
			}
		}

	}

}
