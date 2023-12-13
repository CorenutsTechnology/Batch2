package com.org.stream12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNames {

	public static void main(String[] args) {
		List<String> namelist = new ArrayList();
		namelist.add("hari");
		namelist.add("bhanu");
		namelist.add("dhana");
		namelist.add("priya");
		
//		Long count=namelist.stream().collect(Collectors.counting());
//		System.out.println("Count is"+count);
		
		Stream<String> s=namelist.stream();
		s.forEach(s1->System.out.println(s1));
		s.filter(e->e.equals("hari"));
			
		
		
	}

}
