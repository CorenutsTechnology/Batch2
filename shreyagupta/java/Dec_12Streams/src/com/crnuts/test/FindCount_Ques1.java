package com.crnuts.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCount_Ques1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Shreya", "Mahi", "Ridhi", "Shejal");
		long displayNameList = names.stream().count();

		System.out.println("Number of names: " + displayNameList);

		Stream s = names.stream();

		s.forEach(name -> System.out.println(name));

		// System.out.println(s.filter(i -> i.equals("Mahi"))); IllegalStateException

		// Whenever a terminal operation is called on a Stream object, the instance gets
		// consumed and closed.
		// Therefore, we’re only allowed to perform a single operation that
		// consumes a Stream, otherwise, we’ll get an exception that states
		// that the Stream has already been operated upon or closed.
		
		Stream s2= names.stream();
		//System.out.println(s2.filter(i -> i.equals("Mahi")));
		
		Object n=s2.filter(i -> i.equals("Mahi")).findAny().get();
		
		System.out.println("Is name present");
		System.out.println(n);
		

	}

}
