package com.feuji4dec;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparator<Student>
{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("Hash code method..");
		return Objects.hash(age, name);
		//return 1;
	}
	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("Equals method..");
		
		  if (this == obj)
			  return true; 
		  if (obj == null) 
			  return false; 
		  if (getClass()!= obj.getClass()) 
			  return false; 
		  Student other = (Student) obj;
		  return age ==other.age && Objects.equals(name, other.name);
		 
		//return true;
	}
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge()==o2.getAge())
		return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		else
			return-1;
	}
	
	

}
