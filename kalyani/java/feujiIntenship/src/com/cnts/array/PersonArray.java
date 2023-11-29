package com.cnts.array;

import nov7Th.Person;

public class PersonArray {

	public static void main(String[] args) {
		PersonArray array=new  PersonArray();
	 Person[]person=array.person();
	 Person person0=person[0];
	 Person person1=person[1];
	 System.out.println(person0.getPersonname());
	 System.out.println(person1.getPersonage());
	System.out.println(person[2].getPersonage());
	System.out.println(person[3].getPersonname());
		

	}
	public Person[] person() {
		Person[] person=new Person[5];
		
		Person persons=new Person();
		persons.setPersonname("kalyani");
		//person[0]=persons;
		Person persons1=new Person();
		persons1.setPersonage(22);
		//person[1]=persons1;
		Person persons2=new Person();
		//person[2]=persons2;
		Person persons3=new Person();
		//person[3]=persons3;
		Person persons4=new Person();
		//person[4]=persons4;
		//Person[] kalyani= {persons,persons1,persons2,persons3,persons4};
		return new Person[] {persons,persons1,persons2,persons3,persons4} ;
	}

}
