package com.org.stream13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StudentMain {

	public static void main(String[] args) {
		List<Student> stulist=new ArrayList<>();
		stulist.add(new Student(1,"ram","male"));
		stulist.add(new Student(5,"rama","female"));
		stulist.add(new Student(3,"anu","female"));
		stulist.add(new Student(2,"hari","female"));
	
		stulist.stream().map((e)->e.getName()).collect(Collectors.toList()).forEach((e)->System.out.println(e));
	}

}
