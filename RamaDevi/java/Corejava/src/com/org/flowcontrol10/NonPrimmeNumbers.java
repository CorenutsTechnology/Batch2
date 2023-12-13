package com.org.flowcontrol10;

public class NonPrimmeNumbers {
	/*public boolean isPrime(int number)
	{
		if(number<=1) return false;
		for(int start=2;start<=number/2;start++)
		{
			if(number%start==0)
				return false;
		}
		return true;
}*/
	
	/*public boolean isPrime(int number)
	{
		if(number<=1) return false;
		int start=2;
		while(start<=number/2)
		{
			if(number%start==0)
				return false;
			start++;
		}
		return true;
	}*/
	
	public boolean isPrime(int number)
	{
		do
		{
			int start=2;
			while(start<=number/2)
			{
				if(number%start==0)
					return false;
				start++;
			}
			return true;
		}
		while(number<=1);
	}
}