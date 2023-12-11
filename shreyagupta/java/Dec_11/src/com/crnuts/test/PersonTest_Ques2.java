package com.crnuts.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.crnuts.classes.Person;
import com.crnuts.interfaces.PersonInterface;

public class PersonTest_Ques2 {

	 public static void main(String[] args) {
		 
		 
		 
	        List<Person> people = new ArrayList<>();
	        people.add(new Person("Shreya", 30));
	        people.add(new Person("Arvind", 25));
	        people.add(new Person("Shejal", 35));
	        people.add(new Person("reena", 25));
	        
	        // Sorting based on age using lambda expression
	        people.sort(Comparator.comparingInt(Person::getAge));

	        // Displaying sorted list
	        for (Person person : people) {
	            System.out.println(person);
	        }
	    }
}
