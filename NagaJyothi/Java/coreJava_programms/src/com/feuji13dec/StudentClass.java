package com.feuji13dec;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentClass 
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
		
		
		// to display names from list 
		list.stream().map((e)->e.getName()).collect(Collectors.toList())
		.forEach((e)->System.out.println(e));
		//count the number of female and male candidates
		System.out.println("-----");
		long l=list.stream().map((e)->e.getGender().equals("F")||e.getGender().equals("M"))
		.collect(Collectors.toList()).stream().count();
		System.out.println(l);
		
		
		// display the elements based on cse depatment
		
		list.stream().filter((e)->e.getDepartment().equalsIgnoreCase("CSE"))
		.collect(Collectors.toList()).forEach((e)->System.out.println(e));
		
		//display the elements  based on department.
//		System.out.println(" based on department");
//		list.stream().collect(Collectors.toMap((e)->e.getName(), (e1)->e1.getDepartment()))
//		.entrySet().stream().forEach((e2)->System.out.println(e2));
		
		//display the elements based on depatment
		System.out.println("============");
		System.out.println("display names based on department ");
		list.stream().collect(Collectors.groupingBy((e)->e.getDepartment()))
		.entrySet().forEach((e)->{System.out.println(e.getKey());
		e.getValue().forEach((e1)->System.out.print(e1.getName()+" "));});
		
		System.out.println("mech ");
		list.stream().filter((e)->e.getGender().equalsIgnoreCase("F"))
		.collect(Collectors.toList())
		.stream().filter((e1)->e1.getDepartment().equalsIgnoreCase("Mech"))
		//.collect(Collectors.toList())
		.forEach((e)->System.out.println(e));
		
		// 
//		list.stream().collect(Collectors.groupingBy((e)->e.getState())).entrySet().forEach((e)->System.out.println(e.getValue()));
//		.stream().collect((Collectors.groupingBy((e)->e.getValue())))
//		.entrySet().forEach((e)->System.out.println(e));
		list.stream().collect(Collectors.groupingBy((e)->e.getState()))
		.entrySet().forEach((e)->{System.out.println(e.getKey());
		e.getValue().stream()
		.collect(Collectors.groupingBy(Student::getCity,Collectors.counting())).entrySet().forEach((e1)-> System.out.println(e1.getKey()+" "+e1.getValue()));});
		
		
		
	}

}
