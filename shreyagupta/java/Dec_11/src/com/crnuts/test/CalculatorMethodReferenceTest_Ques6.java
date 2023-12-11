package com.crnuts.test;

import com.crnuts.classes.Calculator;

import com.crnuts.interfaces.CalculatorReferenceMathod;

public class CalculatorMethodReferenceTest_Ques6 {

	public static void main(String[] args) {
		CalculatorReferenceMathod operation1 = (value1, value2) -> {
			System.out.println("Sumation: " + (value1 + value2));
			return value1 + value2;
		};

		Calculator calculator = new Calculator();

		// Method Reference
		CalculatorReferenceMathod operation2 = calculator::add;

		double result = operation1.sum(20.0, 30.1);
		System.out.println("interface sum: " + result);

	}
}
