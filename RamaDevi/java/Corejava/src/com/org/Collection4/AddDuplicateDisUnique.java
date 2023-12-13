package com.org.Collection4;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class AddDuplicateDisUnique {
	public static void main(String[] args) {

		Set<Student> set = new HashSet();
		set.add(new Student(1, "balu"));
		set.add(new Student(2, "giri"));
		set.add(new Student(1, "balu"));
		set.add(new Student(2, "giri"));
		set.add(new Student(3, "giri"));

		for (Student obj : set) {
			System.out.println(obj);
		}

	}
}
