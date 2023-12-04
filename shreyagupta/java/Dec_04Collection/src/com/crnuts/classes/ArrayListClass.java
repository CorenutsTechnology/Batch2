package com.crnuts.classes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(55);
		integers.add(42);
		integers.add(11);
		integers.add(11);
		//integers.set(10,44); //IndexOutOfBoundsException

		System.out.println("set() is used to modify the values");
		integers.set(2, 21);
		
		

		System.out.println("add() is used to add value to the given index and shift values");
		// integers.add(10, 55);//IndexOutOfBoundsException
		for (Integer i : integers) {
			System.out.print(i + " ");
		}

	}

}
