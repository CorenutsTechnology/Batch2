//differentiate b/w Bitwise And Operator(&) and logical and(&&)

package com.operators.nov9;

public class BitwiseAndOperator {

	//it will return  int value
	int bitwiseOperator(int value1 , int value2)
	{
		int result= (value1 & value2);
		System.out.println("bitwise and of "+value1+" and "+value2+" is = "+result);
		return result;
	}
	//it will return  boolean result

	boolean logicalOperator(int value1 , int value2)
	{
		return ((value1 < value2) && (value1 == value2));
	}
}
