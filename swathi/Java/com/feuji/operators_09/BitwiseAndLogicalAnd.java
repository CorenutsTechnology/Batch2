package com.feuji.operators_09;

public class BitwiseAndLogicalAnd {
	
	public int bitwiseAnd(int value1,int value2) {
		
		int result = value1 & value2;
		return result;
		
	}
	
	public void logicalAnd(int value1,int value2) {
		if((value1 < 10) && (value2++ < 10)) {
			System.out.println("true"+value2);	
		}
		else {
			System.out.println("false "+value2);
		}
		
	}
	
	
	public void bitwise_logical(int value1, int value2,int value3) {
		if((value1 > 10) && (value2++ > 10)) {
			System.out.println("true "+value2);	
		}
		else {
			System.out.println("false "+value2);
		}
		if((value1 > 20)&(++value3 <=50)){
			System.out.println("true "+value3);
			
		}else {
			System.out.println("false "+value3);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		BitwiseAndLogicalAnd bitwiseAndLogicalAnd = new BitwiseAndLogicalAnd();
		System.out.println(bitwiseAndLogicalAnd.bitwiseAnd(5, 6));
		bitwiseAndLogicalAnd.logicalAnd(10, 20);
		bitwiseAndLogicalAnd.bitwise_logical(20, 20, 30);
		
		
	}

}
