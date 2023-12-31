//1. Write a program to handle exception using try and catch block

package com.exception.nov17;

public class Question1 
{
	public void exception()
	{
		int[] array = new int[5];
		try {
			System.out.println(array[5]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception is handled");
		}
	}
	public static void main(String[] args) 
	{
		Question1  question1 = new Question1();
		question1.exception();
	}
}
