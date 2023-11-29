package com.cnts.operator;

public class LogicalOperators {
	public boolean andLogical(int value1, int value2) {
		boolean result=((value1>value2)&&(value1>10));
		System.out.println("andresult"+result);
		return result;
	}
	public boolean orLogical(int value1, int value2) {
		boolean result=((value1>value2)||(value1>10));
		System.out.println("orresult"+result);
		return result;
	}
	public boolean notLogical(int value1, int value2) {
		boolean result=!((value1>value2)||(value1>10));
		System.out.println("notresult"+result);
		return result;
	}


}
