package org.november30;

import java.util.HashSet;
import java.util.Set;
public class Practice {
	
	public void createSet() {
		
		Set<Student> students = new HashSet<Student>();
		
		students.add(new Student("A" , 1));
		students.add(new Student("B" , 2));
//		students.add(new Student("C" , 3));
//		students.add(new Student("D" , 4));
//		students.add(new Student("E" , 5));
		
		students.add(new Student("A" , 1));
		students.add(new Student("B" , 2));
//		students.add(new Student("C" , 3));
//		students.add(new Student("D" , 4));
//		students.add(new Student("E" , 5));
		
		for(Student student : students) {
			System.out.println(student);
		}
		System.out.println(students.size());
		
	}
	
	public static void main(String[] args) {
		Practice practice = new Practice();
		
		practice.createSet();
		
	}

}
