package com.assignment.nov11;

public class Palindrome 
{
	public void checkPalindrome(int number)
	{
		int temp=number;
		int result=0;
		while(number>0)
		{
			int reminder = number%10;
			result = result*10+(reminder);
			number /=10;
		}
		if(result == temp)
			System.out.println("given number is palindrome");
		else
			System.out.println("given number not a palindrome");
	}
	public static void main(String[] args) 
	{
		Palindrome palindrome =new Palindrome();
		palindrome.checkPalindrome(1201);
	}
}
