package com.cnts.nov9Operaters;

public class TernaryOperator
{
	public String evenOrOddt(int value)
	{
		String result = value%2==0?"even":"odd";
		return result;
	}
	
	public static void main(String[] args) {
		
		TernaryOperator ternaryOperator = new TernaryOperator();
		System.out.println(ternaryOperator.evenOrOddt(3));
	}
}
