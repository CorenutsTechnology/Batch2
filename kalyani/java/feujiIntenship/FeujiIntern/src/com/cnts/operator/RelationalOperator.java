package com.cnts.operator;

public class RelationalOperator {
	public boolean lessThan( int value1,int value2) {
		boolean result=((value1+value2)<(value1+10));
		System.out.println("lessthan result"+result);
		return result;
		
	}
	public boolean greterThan( int value1,int value2) {
		boolean result=((value1+value2)>(value1+10));
		System.out.println("greterthan result"+result);
		return result;
		
	}
	public boolean greterThanAreEqualto( int value1,int value2) {
		boolean result=((value1+value2)>=(value1));
		System.out.println("greterThanAreEqualtor result"+result);
		return result;
		
	}
	public boolean lessThanAreEqualto( int value1,int value2) {
		boolean result=((value1+value2)<=(value1+10));
		System.out.println("lessThanAreEqualto result"+result);
		return result;
		
	}
	public boolean notEquls( int value1,int value2) {
		boolean result=((value1+value2)!=(value1+10));
		System.out.println("notEquls"+result);
		return result;
		
	}



}
