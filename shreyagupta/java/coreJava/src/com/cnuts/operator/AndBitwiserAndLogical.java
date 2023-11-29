package com.cnuts.operator;

public class AndBitwiserAndLogical {
	
	// difference b/w & (AND bitwiser) and && (and operator)
	
	public int andBitwis(int num1, int num2) {
		int result= ((num1+num2)&(num1+2));
		System.out.println("and bitwiser operator result: "+result);
		return result;
	}
	
	public boolean andLogical(int num1,int num2) {
		boolean result= ((num1==num2)&&((num1+2)<num2));
		System.out.println("and logical operator result: "+result);

		return result;
		
	}

}
