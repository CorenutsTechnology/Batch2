package day_17_11_23_Assignment;

import day_15_11_23.Person;

public class Q5_MultipleException {

	public static void main(String[] args) {
		int intArray[]= new int[6];
		Person person=null;
		
		try {
//			System.out.println(6/intArray[5]);
			System.out.println(7/0);
			System.out.println(person.age);
			System.out.println("try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception : "+e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : "+e);
		}
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
		
		try {
//			System.out.println(7/0);
			System.out.println(6/intArray[5]);
		} catch (ArithmeticException |ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : "+e);
		}
	}

}
