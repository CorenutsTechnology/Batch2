package com.org.MethodRef11;

import java.util.function.BiFunction;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculate=new Calculator();
		BiFunction<Integer, Integer, Integer> bi=calculate::add;
		bi.apply(4,5);
		BiFunction<Integer, Integer, Integer> bi2=calculate::mul;
		bi2.apply(6, 3);
		
	}

}
