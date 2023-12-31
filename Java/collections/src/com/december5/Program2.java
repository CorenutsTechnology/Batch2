//2. Write a program to get values from HashMap without using keys.
package com.december5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program2
{
	public void method()
	{
		Map<Integer ,Student> map = new HashMap<>();
		map.put(1,new Student(1,"jany",23));
		map.put(2,new Student(8,"somu",24));
		map.put(3,new Student(3,"ram",25));
		map.put(4,new Student(4,"karam",23));
		
		Collection<Student> set =map.values();
//		System.out.println(set);
		set.stream().forEach(e->System.out.println(e));
	}
	public static void main(String[] args) {
		new Program2().method();
	}
}
