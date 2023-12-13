package com.org.array08;

public class PersonArrayDriver {

	
	public static void main(String[] args) {
	
		Person[] person1=new Person[4];
		
		person1[0]=new Person();
		
		person1[0].setName("raju");
		person1[0].setAge(20);
		
		System.out.println(person1[0].getName());
		System.out.println(person1[0].getAge());
		
		person1[1]=new Person();
		
		System.out.println(person1[1].getName());
		System.out.println(person1[1].getAge());
		
		person1[2]=new Person();
		person1[2].setName("rani");
		person1[2].setAge(22);
		System.out.println(person1[2].getName());
		System.out.println(person1[2].getAge());
		

	}

}
