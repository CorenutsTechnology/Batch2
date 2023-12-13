package com.feuji9nov;

public class ArithmeticOperators 
{
	public int addition(int value1,int value2)
	{
		int sum=(value1+value2)+10;
		System.out.println(sum);
		return sum;	
	}
	public int subtraction(int value1,int value2)
	{
		int sub=value1-value2;
		System.out.println(sub);
		return sub;
	}
	public int multiplication(int value1,int value2)
	{
		int mul=value1*value2;
		System.out.println(mul);
		return mul;
	}
	public double division(int value1,double value2)
	{
		double div=value1/value2;
		System.out.println(div);
		return div;
	}
	public double moduler(int value1,double value2)
	{
		double mod=value1%value2;
		System.out.println(mod);
		return mod;
	}
	public int operation(int value1,int value2)
	{
		int output=(value1+value2)+5*100/10;
		System.out.println(output);
		return output;
		
	}
	/*
	 * public int increment(int value1,int value2) {
	 * 
	 * 
	 * return (value1++)+(++value2);
	 * 
	 * } public int decrement(int value1) { //int dec=(value1--)+(--value1); return
	 * (value1--)+(--value1); }
	 */
}
