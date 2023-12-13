package com.org.stream13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamCheck {

	public static void main(String[] args) {
		List<String> list2=new ArrayList();
		list2.add("one");
		list2.add("two");
		list2.add("three");
		list2.add("four");
		//String equal checking
	Optional<String> bol=list2.stream().filter(e->e.equals("one")).findFirst();
	System.out.println(bol);
		//count
	System.out.println(list2.stream().count());
	//sorted
	Stream<String> obj=list2.stream().sorted();
	}

}
