package com.cnts.nov10loops;

public class Pattern14 {
	void print(String string)
	{
		int length=string.length();
		for(int index1=0;index1<length;index1++)
		{
			for(int index2=0;index2<=index1;index2++)
			{
				System.out.print(string.charAt(index2));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Pattern14 corenutsPattern14 = new Pattern14();
		corenutsPattern14.print("corenuts");
	}
}
