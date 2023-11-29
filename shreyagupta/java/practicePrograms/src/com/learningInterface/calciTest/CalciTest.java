package com.learningInterface.calciTest;

import com.learingInterface.calci.ArithmeticOprations;
import com.learingInterface.calci.Calculator;

public class CalciTest {

	public static void main(String[] args) {

		Calculator arithmeticOperation = new ArithmeticOprations();
		arithmeticOperation.addition();
		arithmeticOperation.subtraction();
		arithmeticOperation.multipication();
		arithmeticOperation.division();

	}

}
