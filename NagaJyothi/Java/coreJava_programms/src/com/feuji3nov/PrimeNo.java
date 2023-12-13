package com.feuji3nov;

public class PrimeNo 
{
	public static void main(String[] args) 
	{	
		PrimeNo num=new PrimeNo();
		num.prime(5);
	  
	}
	 public void prime(int num)
	   {
		   for(int i=0;i<=10;i++)
			{
				int count=0;
				for(int j=1;j<=i;j++)
				{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(i);
			}
			}
		}
	   }

