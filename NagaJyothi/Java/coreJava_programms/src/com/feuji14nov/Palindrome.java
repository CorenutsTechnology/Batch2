package com.feuji14nov;

public class Palindrome 
{
	public void palindrome(int num)
	{
		int reverse=0;
		int temp=num;
		while(num!=0)
		{
			int lastdigit=num%10;
			reverse=reverse*10+lastdigit;
			num=num/10;
			
		}
		System.out.println("Reverse no:"+reverse);
		if(reverse==temp)
		{
			System.out.println("Given no is palindrome");
		}
		else
		{
			System.out.println("Given no is not a palindrome");
		}
	}
	public static void main(String[] args) 
	{
		Palindrome palindrome=new Palindrome(); 
		palindrome.palindrome(123);
		
	}

}
