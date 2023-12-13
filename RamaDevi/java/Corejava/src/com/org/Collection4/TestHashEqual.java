package com.org.Collection4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHashEqual {

	public static void main(String[] args) {
		AgeCompare agecom = new AgeCompare();
		Set<Student> set = new TreeSet<>(agecom);

		set.add(new Student(23, "ram"));
		//System.out.println(set);
//		set.add(new Student(1, "ram"));
//		System.out.println(set);
		set.add(new Student(20, "bheem"));
		//System.out.println(set);
		set.add(new Student(27,"geetha"));
		set.add(new Student(20, "bheem"));
		set.add(new Student(24,"anu"));
		
		//Collections.sort(agecom, new AgeCompare());
		for(Student stu:set)
		{
			System.out.println(stu);
		}
		System.out.println(set.size());

	}

}
