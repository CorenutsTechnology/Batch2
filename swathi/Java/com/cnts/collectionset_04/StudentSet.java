package com.cnts.collectionset_04;

import java.util.HashSet;
import java.util.TreeSet;

public class StudentSet {
	
	public void display() {
//		HashSet<Student> student = new HashSet();
//		student.add(new Student("swathi",12));
//		student.add(new Student("bindhu",12));
//		student.add(new Student("swathi",12));
//		student.add(new Student("bindhu",12));
//		student.add(new Student("Keerthi",14));
//		
//		for(Student s1:student) {
//			System.out.println(s1);
		NameComparator nameComparator = new NameComparator();
		TreeSet<Student> student = new TreeSet<Student>(nameComparator);
		student.add(new Student("swathi",12));
		student.add(new Student("bindhu",32));
		student.add(new Student("keerthi",34));
		student.add(new Student("navya",78));
		student.add(new Student("kalyani",23));
		for(Student s1:student) {
		System.out.println(s1);
		
		}
	}
}
	
	
	
		
		
	


