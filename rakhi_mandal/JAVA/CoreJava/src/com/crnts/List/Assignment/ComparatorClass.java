package com.crnts.List.Assignment;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Student> {
	

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStudentId()-o2.getStudentId();
	}

}

