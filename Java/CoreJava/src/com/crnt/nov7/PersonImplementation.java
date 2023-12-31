package com.crnt.nov7;

import java.util.Scanner;

public class PersonImplementation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Person person1 = new Person("jon",23,7583749,"male");
		
		System.out.println("Enter Name, Age, Phone Number and Gender of Person");
		person1.setName(sc.next());
		person1.setAge(sc.nextInt());
		person1.setPhoneNumber(sc.nextLong());
		person1.setGender(sc.next());
		
		System.out.println("Person details are: ");
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1.getPhoneNumber());
		System.out.println(person1.getGender());
		//or else we can use toString() to print person details
		
		sc.close();
	}
}
