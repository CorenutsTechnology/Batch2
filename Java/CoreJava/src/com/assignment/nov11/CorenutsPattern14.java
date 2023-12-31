package com.assignment.nov11;
public class CorenutsPattern14 
{
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
		CorenutsPattern14 corenutsPattern14 = new CorenutsPattern14();
		corenutsPattern14.print("corenuts");
	}
}
