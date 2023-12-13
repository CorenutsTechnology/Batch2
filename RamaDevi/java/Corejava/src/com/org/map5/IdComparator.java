package com.org.map5;

import java.util.Comparator;
import java.util.List;

import com.org.MethodRef11.Student;

public class IdComparator implements Comparator<List<Student>>{

	
	@Override
	public int compare(List<Student> o1, List<Student> o2) {
		if(((Student) o1).getId()>((Student) o2).getId())
			return 1;
		if(((Student) o1).getId()<((Student) o2).getId())
			return -1;
		else
			return 0;
	}

}
