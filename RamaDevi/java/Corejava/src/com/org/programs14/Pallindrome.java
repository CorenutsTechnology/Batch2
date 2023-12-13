package com.org.programs14;

public class Pallindrome {
public void checkPallindrome(int number)
{
	int storeNumber=number;
	int remainder=0;
	while(number>0)
	{
		int digit=number%10;
		remainder=(remainder*10)+digit;
		number/=10;
	}
	if(remainder==storeNumber)
		System.out.println("pallindrome");
	else
		System.out.println("not pallindrome");
}
}
