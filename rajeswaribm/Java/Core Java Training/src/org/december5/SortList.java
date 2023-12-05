package org.december5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	
	Comparator compName = new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	};
	
	Comparator compPhone = new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			if(o1.getPhone() > o2.getPhone()) {
				return 1;
			}
			
			else if(o1.getPhone() < o2.getPhone()) {
				return -1;
			}
			else {
				return 0;
			}
		}
		
	};
	
	public void sortListmethod() {
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Raji", 229876));
		persons.add(new Person("Geetha", 63345));
		persons.add(new Person("Lakshmi", 23413));
		
		System.out.println("Before sorting : "+persons);
		System.out.println();
		
		Collections.sort(persons);
		System.out.println("After sorting : "+persons);
		System.out.println();
		
		Collections.sort(persons,compName);
		System.out.println("After sorting : "+persons);
		System.out.println();
		
		Collections.sort(persons,compPhone);
		System.out.println("After sorting : "+persons);
		System.out.println();
		
	}

}
