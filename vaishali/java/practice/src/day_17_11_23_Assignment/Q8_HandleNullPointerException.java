package day_17_11_23_Assignment;

import day_15_11_23.Person;

public class Q8_HandleNullPointerException {

	public static void main(String[] args) {
		Person person=null;
		try {
			System.out.println(person.age);
		} catch (Exception e) {
			System.out.println("Exception : "+e);
		}
	}

}
