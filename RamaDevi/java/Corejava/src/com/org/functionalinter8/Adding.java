package com.org.functionalinter8;

import java.util.function.Function;
import java.util.function.Supplier;

public class Adding {

	public static void main(String[] args) {
		
		AddInterface addval=(value1,value2)->
		{
			Integer result=value1+value2;
			System.out.println(result);
			return result;
		};
		addval.addition(3,6);
		
		
	}

}
