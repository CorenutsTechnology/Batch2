package day_28_11_23;

import java.util.ArrayList;

public class BoundTypeParameters4 {

	public static void main(String[] args) {
		BoundTypeParameters4 parameter=new BoundTypeParameters4();
		Person<String> person1=new Person<>("rani","hyd");
		Person<String> person2=new Person<>("rani","hyd");
		parameter.compare(person1,person2);
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("raj");
		list.add("rani");
		list.add("nani");
		
		parameter.displayUpper(list);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(12);
		list2.add(16);
		list2.add(29);
		
		parameter.displayUpper(list2);
		
//		parameter.displayLower(list); //it allows only Number or Integer
		parameter.displayLower(list2);
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list2.add(12);
		list2.add(16);
		list2.add(29);
		
	}

	public <T extends Comparable<String>> void compare(T value1,T value2) {
		System.out.println(value1.equals(value2));
	}
	
	public  void displayUpper(ArrayList<? extends Comparable> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	public void displayLower(ArrayList<? super Integer> list ) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
