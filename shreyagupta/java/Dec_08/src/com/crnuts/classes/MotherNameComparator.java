package com.crnuts.classes;

import java.util.Comparator;

public class MotherNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getMotherName().compareTo(o2.getMotherName());
	}
	
	

}
