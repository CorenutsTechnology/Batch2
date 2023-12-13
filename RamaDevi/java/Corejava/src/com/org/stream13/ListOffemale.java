package com.org.stream13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOffemale {

	public static void main(String[] args) {
		List<Student> stulist=new ArrayList<>();
		stulist.add(new Student(1,"ram","male","cse"));
		stulist.add(new Student(5,"rama","female","ece"));
		stulist.add(new Student(4,"giri","male","mech"));
		stulist.add(new Student(3,"anu","female","cse"));
		stulist.add(new Student(2,"hari","male","mech"));
		stulist.add(new Student(2,"dhana","female","mech"));
		stulist.add(new Student(6,"priya","female","mech"));
		
		stulist.stream().filter((e)->e.getDept().equals("mech")).filter((e)->e.getGender().equals("female")).forEach((e)->System.out.println(e));
		
		
		
		
	}

}