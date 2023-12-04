package com.crnuts.classes;

import java.util.HashSet;
import java.util.Set;

public class DisplayInSet<E> {

	public void displayIntegers(Set<Integer> integers) {
		System.out.println("Displaying Integer type values");
		for (Integer i : integers) {
			System.out.print(i + " ");
		}
	}

	public void displayCharacters(Set<Character> characters) {
		System.out.println("Displaying Character type values");

		for (Character c : characters) {
			System.out.print(c + " ");
		}
	}
	
	

}
