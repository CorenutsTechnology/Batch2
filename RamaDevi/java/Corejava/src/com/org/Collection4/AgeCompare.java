package com.org.Collection4;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class AgeCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.age > o2.age)
			return 1;
		else if (o1.age < o2.age)
			return -1;
		else
			return 0;
	}

}
