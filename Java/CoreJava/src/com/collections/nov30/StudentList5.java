//5. Create a program to add Student elements to arraylist object and display the elements using for loop 
//and Iterator interface.

package com.collections.nov30;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList5
{
	public String store()
	{
		try {
			ArrayList<Student> student = new ArrayList<>();
			student.add(new Student(1,"ram"));
			student.add(new Student(2,"somu"));
			student.add(new Student(3,"raju"));
			student.add(new Student(4,"karam"));
			student.add(new Student(5,"shyam"));
			
			System.out.println("printing using for each loop");
			for(Student object:student)
			{
				System.out.println(object);
			}
			
			System.out.println("printing using iterator");
			Iterator<Student> iterator = student.iterator();
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
			return "success";
		}catch(Exception e)
		{
			return "failed";
		}
	}

}
