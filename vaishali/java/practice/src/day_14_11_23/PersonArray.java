package day_14_11_23;

import day_07_11_23.Person;

public class PersonArray {

	public static void main(String[] args) {
		Person object1=new Person("vaishali",22);
		Person object2=object1;
		Person values[]= {new Person(),new Person(),object1,object2};
		for (int index = 0; index < values.length; index++) {
			System.out.println("person"+index);
			System.out.println(values[index].getName());
			System.out.println(values[index].getAge());
		}
	}

}
