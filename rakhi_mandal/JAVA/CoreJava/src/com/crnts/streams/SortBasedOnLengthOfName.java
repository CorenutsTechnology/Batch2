//Sort employees based on the length of their names using streams?
package com.crnts.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnLengthOfName {

	public static void main(String[] args) {
		List<Student> listStudents=new ArrayList<>();
		listStudents.add(new Student(1,"tom","male","cse","hoskote","bangalore","karnataka"));
		listStudents.add(new Student(12,"jack","male","mech","hopfarm","bangalore","karnataka"));
		listStudents.add(new Student(9,"shreya","female","mech","ameerpeth","hyd","telangana"));
		listStudents.add(new Student(3,"jinnie","female","mech","mg nagar","bbsr","odisha"));
		listStudents.add(new Student(2,"joe","male","cse","mg nagar","puri","odisha"));
		
		listStudents.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().length()-o2.getName().length();
			}

			}
			
		).forEach((e)->System.out.println(e));
	}

}
