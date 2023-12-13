package com.org.flowcontrol10;

public class ThirdMultiplication {
	/*public void thirdMultiplication(int table)
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println(table+"*"+i+"="+(table*i));	
		}	
	}*/
	
	/*public void thirdMultiplication(int table)
	{
		int start=1;
		while(start<=10)
		{
			System.out.println(table+"*"+start+"="+(table*start));
			start++;
		}
	}*/
	public void thirdMultiplication(int table)
	{
		int start=0;
		do
		{
			start++;
			if((table*start)%2==0) {
			
				continue;
				}
			else
			{
				System.out.println(table+"*"+start+"="+(table*start));
			}
					
		}
		
		while(start<10);
	}


}