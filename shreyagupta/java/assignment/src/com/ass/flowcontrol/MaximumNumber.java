package com.ass.flowcontrol;

public class MaximumNumber {

	public static void main(String[] args) {
		MaximumNumber maximumNumber= new MaximumNumber();
		maximumNumber.maxNum(44, 10, 14);
	}
	
	void maxNum(int value1,int value2,int value3) {
		if(value1>value2&&value1>value3) {
			System.out.println("maximum number is "+value1);
		}
		else if(value2>value3) {
			System.out.println("maximum number is "+value2);
		
		}
		else {
			System.out.println("maximum number is "+value3);
		
		}
	}

}
