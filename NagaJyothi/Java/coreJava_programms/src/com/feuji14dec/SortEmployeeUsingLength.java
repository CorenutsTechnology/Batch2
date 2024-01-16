package com.feuji14dec;

import java.util.ArrayList;import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.feuji13dec.Student;

public class SortEmployeeUsingLength 
{
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(1, "Jyothi", "F", "Cse", "Rentala", "Rentachintala", "AP"));
		list.add(new Student(2, "Indu", "F", "Cse", "patabhipuram", "Guntur", "AP"));
		list.add(new Student(3, "Puri", "F", "Cse", " srinivasanagar", "chirala", "AP"));
		list.add(new Student(4, "Siri", "F", "Mech", "Renatala", "Rentachintala", "AP"));
		list.add(new Student(5, "Richi", "F", "Ece", "Kphb", "Hyd", "Ts"));
		list.add(new Student(6, "Raji", "F", "EEE", "Kphb", "Hyd", "Ts"));
		list.add(new Student(7, "Sri", "M", "Mech", "Rentala", "Rentachintala", "AP"));
		list.add(new Student(8, "Rakesh", "M", "Civil", "kphb", "Hyd", "TS"));
		list.add(new Student(9, "Chandu", "M", "CSE", "Vijayawada", "Vijayawada", "AP"));
		//list.stream().filter((e)->e.getName()).co
		
		//print male name whose name start with s
		list.stream().filter((e)->e.getGender().equalsIgnoreCase("m"))
		.collect(Collectors.toList()).stream().filter((e)->e.getName().startsWith("S"))
		.forEach((e)->System.out.println(e));
	    
		// sort employees based on length.
		
		list.stream().sorted((s1,s2)->{
			if(s1.getName().length()>s2.getName().length())
				return 1;
			else
			return-1;
		}) .forEach((e)->System.out.println(e));
		
		list.stream().sorted((e1 ,e2)->(e1.getName().compareTo(e2.getName())))
		.forEach(e->System.out.println(e.getName()));
		System.out.println("-----");
		list.stream().sorted(Comparator.comparing(Student::getName))
		.forEach(e->System.out.println(e));
		
	}

}
