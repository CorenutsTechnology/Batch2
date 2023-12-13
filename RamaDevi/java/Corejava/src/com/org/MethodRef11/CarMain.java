package com.org.MethodRef11;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CarMain {

	public static void main(String[] args) {
		CarMain mancar=new CarMain();
//		Supplier<Integer> supply=Car::staticMethod;
//		supply.get();
		Consumer <Integer>consume=Car::staticMethod;
		consume.accept(8);
	}

}
