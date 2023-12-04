package com.crnuts.testClass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import com.crnuts.classes.Student;
import com.crnuts.classes.StudentNameComparator;

//QUES - 3, 5, 6, 7

public class StudentTest {
	public static void main(String[] args) {
		
		System.out.println("** Set interface doesnot allow duplicated. ** \n");

		Student s1 = new Student("shreya", 62);
		Student s2 = new Student("manish", 24);
		Student s4 = new Student("priya", 24);
		Student s3 = new Student("manish", 24);
		

		System.out.println("Displaying student details through LinkedHashSet class:");
		Set<Student> students = new LinkedHashSet<>();

		//System.out.println("Displaying student details through HashSet class:");
		// Set<Student> students = new HashSet<>();

		//System.out.println("Displaying student details through TreeSet class:");
		// Set<Student> students = new TreeSet<>();

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		for (Student s : students) {
			System.out.println(s);
		}

		System.out.println("\n");
		System.out.println("Student Name Comparator");
		StudentNameComparator comparator = new StudentNameComparator();
		comparator.compare(s3, s4);
		System.out.println("Comparing two students names, " + s3.getName() + " and " + s1.getName() + " : "
				+ comparator.compare(s3, s1));

	}
}
