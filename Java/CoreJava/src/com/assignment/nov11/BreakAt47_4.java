package com.assignment.nov11;

public class BreakAt47_4 
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
		BreakAt47_4 breakAt47 = new BreakAt47_4();
		breakAt47.printNumbers();
	}
}
