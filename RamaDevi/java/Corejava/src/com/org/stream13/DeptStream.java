package com.org.stream13;

import java.util.ArrayList;
import java.util.List;

public class DeptStream {

	public static void main(String[] args) {
		List<Student> stulist=new ArrayList<>();
		stulist.add(new Student(1,"ram","male","cse"));
		stulist.add(new Student(5,"rama","female","ece"));
		stulist.add(new Student(3,"anu","female","cse"));
		stulist.add(new Student(2,"hari","male","mech"));
		
		List<Student> count=stulist.stream().filter((e)->e.getDept().equals("cse")).toList();
		count.forEach(e2->System.out.println(e2));
		
	}

}
