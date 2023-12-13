package com.feuji11dec;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import com.feuji3nov.PrimeNo;

public class PrimeNumber 
{
	public boolean prime(int num)
	{
			 
				   int count=0;
					for(int j=1;j<=num;j++)
					{
					if(num%j==0)
					{
						count++;
					}
					
				}
				
				
				if(count==2)
				{
	                  return true;
					
				}
				else
				return false;
							 
			
		   }
	
    public static void main(String[] args)
	{
    	int sum=0;
    	PrimeNumber num=new PrimeNumber();
		Predicate<Integer> predicate=num::prime;
		for(int i=1;i<100;i++)
		{
			if(predicate.test(i))
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
