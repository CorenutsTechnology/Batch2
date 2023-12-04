package com.crnuts.testClass;

import java.util.HashSet;
import java.util.Set;

//Ques 1, 2, 4

import com.crnuts.classes.DisplayInSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		

		DisplayInSet<Integer> displayInt = new DisplayInSet<>();

		Set<Integer> integers = new HashSet<>();
		integers.add(55);
		integers.add(42);
		integers.add(11);
		integers.add(11);
		
		displayInt.displayIntegers(integers);
		
		System.out.println("\n");
		
		System.out.println("Ques- 2,4 "+"\n"+"Set does not allow dublicates as it works on hashCode \n");

		DisplayInSet<Character> displayChar = new DisplayInSet<>();

		

		Set<Character> characters = new HashSet<>();
		characters.add('f');
		characters.add('r');
		characters.add('t');
		displayChar.displayCharacters(characters);
		
		

	}
}
