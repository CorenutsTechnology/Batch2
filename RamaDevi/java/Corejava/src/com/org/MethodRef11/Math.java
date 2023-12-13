package com.org.MethodRef11;

public class Math {
	public void add(int val1, int val2) 
	{
		int sumValue=val1+val2;
		System.out.println(sumValue);
		//return sumValue;
	}
	public static void main(String[] args) {
		Math math1=new Math();
		math1.add(2, 7);
	
	}


}
