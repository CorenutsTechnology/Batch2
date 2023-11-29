package com.crnuts.genericsTest;

import java.util.ArrayList;

//-------------Ques 2------------------

import com.crnuts.genericClass.GenericClass;

public class GenericClassTest {

	public static void main(String[] args) {

		GenericClass<Character> class1 = new GenericClass<>('a');
		System.out.println(class1.getGeneric());

		GenericClass<Integer> class2 = new GenericClass<Integer>(64);
		System.out.println(class2.getGeneric());

		GenericClass<String> class3 = new GenericClass<String>("free");
		System.out.println(class3.getGeneric());

		// class1=class2; CTError,
		// Type mismatch: cannot convert from GenericClass<Integer>
		// to GenericClass<Character>

	}

}
