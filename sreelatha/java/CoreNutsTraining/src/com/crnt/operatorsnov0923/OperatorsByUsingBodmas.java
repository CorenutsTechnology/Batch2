package com.crnt.operatorsnov0923;

public class OperatorsByUsingBodmas {
	public static void main(String[] args) {
		OperatorsByUsingBodmas b = new OperatorsByUsingBodmas();
		System.out.println(b.bodmas(5, 7));
		
	}
	public double bodmas(int value1 , int value2)
	{
		double result = (value1 + value2)-(value1) *(value1* value2) -(value2%value1 )+(value1/value2);
		
		return result;
		
	}

}
