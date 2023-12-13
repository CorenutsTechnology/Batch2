package com.crnts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MechFemale {

	public static void main(String[] args) {
		List<Student> listStudents=new ArrayList<>();
		listStudents.add(new Student(1,"tom","male","cse","hoskote","bangalore","karnataka"));
		listStudents.add(new Student(12,"jack","male","mech","hopfarm","bangalore","karnataka"));
		listStudents.add(new Student(9,"shreya","female","mech","ameerpeth","hyd","telangana"));
		listStudents.add(new Student(3,"jinnie","female","mech","mg nagar","bbsr","odisha"));
		listStudents.add(new Student(2,"joe","male","cse","mg nagar","puri","odisha"));
		
		List result=listStudents.stream().filter((e)->e.getGender().equals("female") && e.getDepartment().equals("mech")).collect(Collectors.toList());
		result.stream().forEach((e)->System.out.println(e));
		
	}

}
