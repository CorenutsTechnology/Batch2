package com.feuji30nov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheElements 
{
	public void sortTheElemnts(List<Student>list)
	{
		//Collections.sort(list, Comparator);
	}
	public static void main(String[] args) 
	{

		List<Student> list=new ArrayList<>();
		list.add(new Student(1, "Jyothi", 22, "Hyd"));
		list.add(new Student(2, "Indu", 23, "Guntur"));
		list.add(new Student(3, "Puri", 24, "USA"));
		list.add(new Student(1, "Richi", 23, "Hyd"));
		
		SortTheElements sort=new SortTheElements();
		//sort.sortTheElemnts(list, Student);
		//list.stream().sorted(Comparator.comparing(Student::getSage)).forEach((e)->System.out.println(e));
	}

}
