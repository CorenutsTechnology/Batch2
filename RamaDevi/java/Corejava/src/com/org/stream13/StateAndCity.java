package com.org.stream13;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StateAndCity {

	public static void main(String[] args) {
		List<Student> stulist=new ArrayList<>();
		stulist.add(new Student(1,"ram","male","cse","ap","kadapa"));
		stulist.add(new Student(5,"rama","female","ece","ts","varangal"));
		stulist.add(new Student(4,"giri","male","mech","ap","kadapa"));
		stulist.add(new Student(3,"anu","female","cse","karnataka","bang"));
		stulist.add(new Student(2,"hari","male","mech","ap","kadapa"));
		stulist.add(new Student(2,"dhana","female","mech","ts","varangal"));
		stulist.add(new Student(6,"priya","female","mech","kerala","kaira"));
		
		Map<Object, Long> count=stulist.stream().collect(Collectors.groupingBy((e)->e.getDept(),Collectors.counting()));
		//count.entrySet().
	}

}
