package day_17_11_23_Assignment;

import day_15_11_23.Person;

public class Q3_HandleException_try_catch_finally {

	public static void main(String[] args) {
		Person person=null;
		System.out.println("start");
		try {
			System.out.println(person.age);
		}
		catch(NullPointerException e) {
			System.out.println("Exception : "+e);
		}
		finally {
			System.out.println("finally block");
		}
		
	}

}
