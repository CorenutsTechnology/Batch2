package com.crnts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoriesDept {

	public static void main(String[] args) {
		List<Student> listStudents=new ArrayList<>();
		listStudents.add(new Student(1,"tom","male","cse","hoskote","bangalore","karnataka"));
		listStudents.add(new Student(12,"jack","male","mech","hopfarm","bangalore","karnataka"));
		listStudents.add(new Student(9,"shreya","female","eee","ameerpeth","hyd","telangana"));
		listStudents.add(new Student(3,"jinnie","female","mech","mg nagar","bbsr","odisha"));
		listStudents.add(new Student(2,"joe","male","cse","mg nagar","puri","odisha"));
		
		
		listStudents.stream().collect(Collectors.groupingBy(Student::getDepartment)).entrySet().forEach(e ->{System.out.println("Department - " + e.getKey());
		e.getValue().forEach((e1)->System.out.println(e1.getName()));});
		}
		
	}

