package com.feuji7dec;

public class DisplayNumbersClass 
{
	public static void main(String[] args) 
	{
		DisplayNumbers numbers=(number)->{
			for(int index=1;index<=number;index++)
				System.out.println(index);
			
		};
		numbers.printNumbers(100);
		
	}

}
