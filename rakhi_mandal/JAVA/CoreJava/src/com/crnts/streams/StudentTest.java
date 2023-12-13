package com.crnts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> listStudents=new ArrayList<>();
		listStudents.add(new Student(1,"tom","male","cse","hoskote","bangalore","karnataka"));
		listStudents.add(new Student(12,"jack","male","mech","hopfarm","bangalore","karnataka"));
		listStudents.add(new Student(9,"shreya","female","eee","ameerpeth","hyd","telangana"));
		listStudents.add(new Student(3,"jinnie","female","mech","mg nagar","bbsr","odisha"));
		listStudents.add(new Student(2,"joe","male","mech","mg nagar","puri","odisha"));
		
		System.out.println("Count of male :"+listStudents.stream().filter((e)->e.getGender().equals("male")).count());
		System.out.println("Count of female :"+listStudents.stream().filter((e)->e.getGender().equals("female")).count());
        
		
		
		Map<String, List<Student>> groupMap = listStudents.stream().collect(Collectors.groupingBy(e -> e.getGender()));
		groupMap.entrySet().stream().forEach(e -> System.out.println("Gender - " + e.getKey()+"-->"+e.getValue()));
	
	}
}


