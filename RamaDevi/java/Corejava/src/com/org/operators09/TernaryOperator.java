package com.org.operators09;

public class TernaryOperator {
public void evenOrOdd(int value)
{
String result=(value%2==0)?"even":"odd";
System.out.println(result);
}
public static void main(String[] args) {
	TernaryOperator ternaryOperator=new TernaryOperator();
	ternaryOperator.evenOrOdd(5);
}	
}
