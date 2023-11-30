package day_08_11_23;

import day_07_11_23.Person;

public class PersonArray {

	public static void main(String[] args) {
		PersonArray personArray=new PersonArray();
		Person[] p=personArray.persons();
		for (int i = 0; i < p.length; i++) {
			Person person = p[i];
			System.out.println(person);
		}
	}

	public Person[] persons() {
		Person[] persons=new Person[5];
		Person person=new Person();
		person.setName("vaishali");
		person.setAge(22);
		persons[0]=person;
		
		Person person1=new Person();
		persons[1]=person1;
		
//		System.out.println(persons[0]);
		return persons;
	}
}
