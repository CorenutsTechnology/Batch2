package com.feuji3nov;

public class PrimeNo2
{
	public static void checkPrime()
	{
		int num=6;
		int count=0;
		for(int i=1;i<=10;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println(num+"is a prime no");
		}
		else
		{
			System.out.println(num+"is a not a prime no");
		}
	}
    public static void main(String[] args)
    {
    	//PrimeNo2 p1=new PrimeNo2();
    	checkPrime();
		
	}
}
