package com.feuji14nov;

import java.util.Random;

public class RandomNumbersUsingInfi 
{
	public static void main(String[] args)
	{
		Random random=new Random();
		for(;;)
		{
			int value1=random.nextInt(100);
			System.out.println(value1);
		}
		
	}

}
