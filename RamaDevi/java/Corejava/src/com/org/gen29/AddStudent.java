package com.org.gen29;

import java.util.ArrayList;
import java.util.Iterator;

public class AddStudent {

	public static void main(String[] args) {
		ArrayList<Student>  arrayList=new ArrayList<>();
		//Adding elements into arrayList
		arrayList.add(new Student("hari",28));
		arrayList.add(new Student("giri",33));
		arrayList.add(new Student("balu",18));
		arrayList.add(new Student("dhana",23));
		
		System.out.println(arrayList);
		//displaying the list elements using for loop
		for(int index=0;index<arrayList.size();index++)
		{
			System.out.println(arrayList.get(index));
		}
		
		// iterating the elements using iterator
				Iterator<Student> iterate = arrayList.iterator();
				while (iterate.hasNext()) {
					Student value = iterate.next();
					System.out.println(value);
				}
		
	}

}
