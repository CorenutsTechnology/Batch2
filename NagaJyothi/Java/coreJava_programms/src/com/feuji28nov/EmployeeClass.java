package com.feuji28nov;

public class EmployeeClass<T> implements Employee {

	@Override
	public void details(Object value1, Object value2) {
		System.out.println(value1);
		System.out.println(value2);

	}

	public static void main(String[] args) {
		EmployeeClass<Integer> res = new EmployeeClass<>();
		res.details(10.00, 20.00);
		EmployeeClass<String> res1 = new EmployeeClass<>();
		res1.details(10, "Jyothi");

		String str = null;
		System.out.println(str);
		/*
		 * switch (str) { case "null":// #1 System.out.println("null string"); // #2
		 * break; default:System.out.println("..."); break; }
		 */
		String s1 = "Jyothi";
		String s2 = new String("Jyothi");

		System.out.println(s1 == s2.intern());

		/*
		 * String str1 = "Java";
		 * 
		 * String str2 = new String("Java");
		 * 
		 * System.out.println(str1 == str2);
		 * 
		 * System.out.println(str1.equals(str2)); System.out.println(str1.hashCode());
		 * System.out.println(str2.hashCode()); System.out.println(str1.hashCode() ==
		 * str2.hashCode());
		 */

	}
}