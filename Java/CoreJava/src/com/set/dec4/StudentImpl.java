//3. Write a program to add duplicate Student elements to hashset objects and display the unique Student elements as output?
package com.set.dec4;
import java.util.*;
public class StudentImpl 
{
	public void method()
	{
		Set<Student> set = new HashSet<>();
		set.add(new Student(1,"pravali",98.1));
		set.add(new Student(2,"gowri",96.2));
		set.add(new Student(3,"ambika",95.1));
		set.add(new Student(3,"ambika",95.1));
		set.add(new Student(4,"rubeena",95.3));
		set.add(new Student(4,"rubeena",95.3));
		
		set.stream().forEach(System.out::println);		
	}
	public static void main(String[] args) {
		new StudentImpl().method();
	}
}
