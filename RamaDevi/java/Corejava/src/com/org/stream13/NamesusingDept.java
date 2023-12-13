package com.org.stream13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamesusingDept {

	public static void main(String[] args) {
		List<Student> stulist=new ArrayList<>();
		stulist.add(new Student(1,"ram","male","cse"));
		stulist.add(new Student(5,"rama","female","ece"));
		stulist.add(new Student(3,"anu","female","cse"));
		stulist.add(new Student(2,"hari","male","mech"));
		
//		stulist.stream().collect(Collectors.groupingBy((e)-> e.getDept(),Collectors.counting()))
//		.forEach((e,count)->{
//			System.out.println(e+" -"+count);
//		});
		
		Map<String,List<Student>> ref=stulist.stream().collect(Collectors.groupingBy((e)->e.getDept()));
		
		ref.entrySet().stream().forEach((e)->
		{
			System.out.println(e);
		});
	}

}
