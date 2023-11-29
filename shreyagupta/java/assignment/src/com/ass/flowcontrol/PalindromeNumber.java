package com.ass.flowcontrol;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		PalindromeNumber palindromeNum=new PalindromeNumber();
		if(palindromeNum.isPalindrome(15251)) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
		
	}
	
	public boolean isPalindrome(int num) {
		int reminder=0;
		int reverse=0;
		int num2=num;
		while(num!=0) {
			reminder=num%10;
			reverse = (reverse*10)+reminder;
			num=num/10;
		}
		return num2==reverse;
	}

}
