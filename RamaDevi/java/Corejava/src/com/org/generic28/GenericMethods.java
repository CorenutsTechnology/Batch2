package com.org.generic28;

import java.util.ArrayList;

public class GenericMethods {
	<T> void genricMethod1(T[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String args[]) {
		GenericMethods gm = new GenericMethods();
		Integer intArray[] = { 5, 6, 7, 3, 8 };
		gm.genricMethod1(intArray);
		String[] stringArray = { "Krishna", "Rama", "Radha", "Bhanu" };
		gm.genricMethod1(stringArray);
		
	}
}
