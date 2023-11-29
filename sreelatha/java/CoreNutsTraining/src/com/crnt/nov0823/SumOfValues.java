package com.crnt.nov0823;

public class SumOfValues {
	public static void main(String[] args) {
		SumOfValues  sum= new SumOfValues();
		sum.sumArray();
		
	}

	private void sumArray() {
		int [] values= new int[4];
		values[0]=3;
		values[1]=6;
		
		values[2]=9;
		values[3]=31;
		System.out.println("sum of all the values : "+(values[0]+values[1]+values[2]+values[3]));
		
		
		
	}

}
