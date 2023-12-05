package com.crnts.Generics;

import java.util.ArrayList;

public class BoundedParameters {

	public <T extends Comparable<String>> void compare(T value1, T value2) {
		System.out.println(value1.equals(value2));
	}
//Lower bound
	public void display(ArrayList<? extends Number> list) {

		for (Object obj : list) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		BoundedParameters boundedParameters = new BoundedParameters();
//		boundedParameters.compare(new Person(), new Person());
		boundedParameters./* <String> */compare(new Person("neha", 90), new Person("rakhi", 90));

		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Hyd");
		stringList.add("Delhi");
		stringList.add("Sikkim");
	//	boundedParameters.display(stringList);

		ArrayList<Integer> stringList1 = new ArrayList<>();
		stringList1.add(890);
		stringList1.add(66);
		stringList1.add(89);
		boundedParameters.display(stringList1);

	}

}
