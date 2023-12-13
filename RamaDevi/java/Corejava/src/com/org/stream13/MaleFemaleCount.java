package com.org.stream13;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaleFemaleCount {

	public static void main(String[] args) {
		List<Student> stulist=new ArrayList<>();
		stulist.add(new Student(1,"ram","male"));
		stulist.add(new Student(5,"rama","female"));
		stulist.add(new Student(3,"anu","female"));
		stulist.add(new Student(2,"hari","male"));
		Student stu=new Student();
		
//	Long men	=stulist.stream().filter(e->e.getGender().equals ("male")).count();
//	System.out.println(men);
//	Long women=stulist.stream().filter(m1->m1.getGender().equals("female")).count();
//	System.out.println(women);
//	
	Map<Object,Long> ref=stulist.stream().collect(Collectors.groupingBy(e2->e2.getGender(),Collectors.counting()));
	
		for (Map.Entry<Object, Long> entry : ref.entrySet()) {
			Object key = entry.getKey();
			Long val = entry.getValue();
			System.out.println(key+" "+val);
			
		}
	}

}
