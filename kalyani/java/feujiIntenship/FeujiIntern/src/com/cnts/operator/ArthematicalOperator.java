package com.cnts.operator;

public class ArthematicalOperator {
public int addition(int value1, int value2) {
	int result=((value1+value2)+(value1+10));
	System.out.println("addition result"+result);
	return result;
}
public double Subtraction(int value1,double value2) {
	double result=((value1-value2)+(value1+10));
	System.out.println("Subctration result"+result);
	return result;
}
public long mutiplication(int value1,int value2) {
	long result=((value1*value2)+(value1+10));
	System.out.println("mutiplication result"+result);
	return result;
}
public double division(int value1,double value2) {
	double result=((value1+value2)/(value1+10));
	System.out.println("division result"+ result);
	 return result;
}
public int modules(int value1,int  value2) {
	int result=((value1+value2)%(value1+10));
	System.out.println("modules result"+result);
	return result;
}
}
