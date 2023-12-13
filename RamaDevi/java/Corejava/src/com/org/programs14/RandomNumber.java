package com.org.programs14;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		int[] randomNumbers=new int[25];
		Random random=new Random();
		for(int i=0;i<randomNumbers.length;i++)
		{
			randomNumbers[i]=random.nextInt(100)+1;
		}
		for(int i=0;i<randomNumbers.length-1;i++)
		{
			int currentNumber=randomNumbers[i];
			int nextNumber=randomNumbers[i+1];
			if(currentNumber<nextNumber)
			{
				System.out.println(currentNumber+"is less than"+nextNumber);
			}
			else if(currentNumber>nextNumber)
			{
				System.out.println(currentNumber+"is greater than"+nextNumber);
			}
			else
			{
				System.out.println(currentNumber+"is equal to"+nextNumber);
			}
		}
		
		
	}
}
