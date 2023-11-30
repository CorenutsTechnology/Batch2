package day_17_11_23_Assignment;

import day_15_11_23.Person;

public class Q9_Multiple_try_catch_finally {

	public static void main(String[] args) {
		int intArray[]= {7,5,8};
		Person person=null;
		
		try {
			System.out.println(intArray[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : "+e);
		}
		finally {
			System.out.println("finally block-1");
		}
		try {
			System.out.println(9/0);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
		finally {
			System.out.println("finally block-2");
		}
		try {
			System.out.println(person.age);
		}
		catch (NullPointerException e) {
			System.out.println("Exception : "+e);
		}
		finally {
			System.out.println("finally block-3");
		}
	}

}
