package com.crnts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StateCityWise {

	public static void main(String[] args) {
		List<Student> listStudents=new ArrayList<>();
		listStudents.add(new Student(1,"tom","male","cse","hoskote","bangalore","karnataka"));
		listStudents.add(new Student(12,"jack","male","mech","hopfarm","bangalore","karnataka"));
		listStudents.add(new Student(9,"shreya","female","mech","ameerpeth","hyd","telangana"));
		listStudents.add(new Student(3,"jinnie","female","mech","mg nagar","bbsr","odisha"));
		listStudents.add(new Student(2,"joe","male","cse","mg nagar","puri","odisha"));
		
	listStudents.stream().collect(Collectors.groupingBy(Student::getState)).entrySet().forEach(e ->{System.out.println("State - " + e.getKey());
//
		e.getValue().stream().collect(Collectors.groupingBy(Student::getCity,Collectors.counting())).entrySet().forEach((e1)->System.out.println(e1.getKey()+"-->"+e1.getValue()));});
//	Map<String,Map<String,long>>=listStudents.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.counting())).entrySet().forEach(e1 ->System.out.println("State - " + e1.getvalue()));

	
		
	
		
	}


}
