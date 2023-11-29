package com.cnts.nov10loops;

public class MultiplicationTable3 
{
	void tableUsingWhile(int number)
	{
		System.out.println("Using while loop");
		int index=1;
		while(index<=10)
		{
			System.out.println(number+ " * "+index+" = "+(number*index++));
			index++;
		}
	}
	
	void tableUsingDoWhile(int number)
	{
		System.out.println("Using Dowhile loop");
		int index=1;
		do{
			System.out.println(number+ " * "+index+" = "+(number*index++));
			index++;
		}while(index<=10);
	}
	
	public static void main(String[] args) 
	{
		MultiplicationTable3 multiplicationTable3 = new MultiplicationTable3();
		multiplicationTable3.tableUsingWhile(3);
		multiplicationTable3.tableUsingDoWhile(3);
	}
}
