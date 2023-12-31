/*
 * this program is to show non primitive array , using person class
 */


package com.arrays.nov8;
import java.util.Scanner;

import com.crnt.nov7.Person;

public class PersonClassArray 
{
	static Scanner sc = new Scanner(System.in);
	void createPersonObjects(Person[] person)
	{
		
		for(int index=0;index<person.length;index++)
		{
			System.out.println("Enter name, age,phone Number, gender");
			person[index]=new Person(sc.next(),sc.nextInt(),sc.nextLong(),sc.next());
		}
	}
	
	int sumOfAges(Person[] persons)
	{
		int totalSum = 0;
		for(Person person :persons)
		{
			totalSum += person.getAge();
		}
		return totalSum;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter size of Person Array");
		Person[] persons = new Person[sc.nextInt()];
		
		PersonClassArray object = new PersonClassArray();
		
		//calling createPersonObjects method
		object.createPersonObjects(persons);
		
		System.out.println("Details of persons are");
		for(Person person:persons)
		{
//			System.out.print("Name: "+person.getName()+" Age: "+person.getAge()+
//								" Phone NUmber: "+person.getPhoneNumber()+
//								" Gender: "+person.getGender());
			System.out.println(person);
			System.out.println();
		}
		
		System.out.println("sum of ages of all persons is: "+object.sumOfAges(persons));
		
	}

}
