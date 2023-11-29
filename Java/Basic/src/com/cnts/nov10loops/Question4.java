package com.cnts.nov10loops;

public class Question4 
{
	void printNumbers()
	{
		for(int index=1;index<=100;index++)
		{
			if(index==47)
				break;
			else
				System.out.print(index+" ");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("printing numbers from 1 to 100");
		Question4  breakAt47 = new Question4();
		breakAt47.printNumbers();
	}
}
