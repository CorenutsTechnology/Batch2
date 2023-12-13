package com.feuji14nov;

public class Loopprogram 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
		{
		boolean flag=true;
		while(flag)
		{
			System.out.println("loop"+i);
			int j=0;
			do {
				if(i==6)
				{
					System.out.println("6th iteration");
					continue;
				}
				i++;
				j++;
			}while(j<10);
		}
		flag=(i++<=10);
		}
		
	}

}
