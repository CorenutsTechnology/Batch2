package com.crnuts.testClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.crnuts.classes.Student;

public class StudentTest {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		Student student1 = new Student("Shreya", "Gupta","Reena Gupta");
		Student student2 = new Student("Priya", "Sharma","parvati Devi");
		Student student3 = new Student("Shejal", "Gupta","Lakshmi Gupta");
		Student student4 = new Student("Mahi", "seth","Sweety Seth");

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		System.out.println("shorting based on student's first name :");
		Comparator firstName = (s1, s2) -> {
			return ((Student) s1).getFirstName().compareTo(((Student) s2).getFirstName());
		};
		Collections.sort(students, firstName);

		for (Student student : students) {
			System.out.println(students);
		}

		System.out.println("\n");
		System.out.println("shorting based on student's last name :");

		Comparator lastName = (o1, o2) -> {
			return ((Student) o1).getLastName().compareTo(((Student) o2).getLastName());
		};

		Collections.sort(students, lastName);

		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println("\n");
		System.out.println("shorting based on student's mother name :");
		
		Comparator motherName=(o1,o2)->{
			return ((Student)o1).getMotherName().compareTo(((Student)o2).getMotherName());
		};
		
		Collections.sort(students,motherName);
		
		for(Student stu: students) {
			System.out.println(stu);
		}
		

	}

}
