package com.crnts.oops;

public class OverLoadingP3 {

	public static void main(String[] args) {
		OverLoadingP3 overLoadingP3=new OverLoadingP3();
		overLoadingP3.sum(8, 90);
		overLoadingP3.sum(8, 90,8);
	}
	 void sum(int value1,int value2)
	{
		int sum=value1+ value2;
		System.out.println("sum of two values: "+sum);
	}
	
	 void sum(int value1,int value2,int value3)
	{
		int sum=value1+value2+value3;
		System.out.println("sum of three values: "+sum);
	}
	
	
}
