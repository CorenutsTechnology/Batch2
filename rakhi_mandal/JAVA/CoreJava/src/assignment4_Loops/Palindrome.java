package assignment4_Loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check :");
		palindrome.palindromeCheck(sc.nextInt());
	}
	public void palindromeCheck(int number) {
		int temporary=number;
		int newNumber=0;
		while(number!=0)
		{
			int remain=number%10;
			newNumber=newNumber*10+remain;
			number=number/10;
		}
		if(temporary==newNumber)
			System.out.println("Yes, the number is a palindrome");
		else
			System.out.println("No, the number is not a palindrome");
	}

}
