package day_29_11_23;

import java.util.ArrayList;

public class BoundedTypeClass {

	public <T extends Comparable<Integer>> void compare(T value1,T value2) {
		System.out.println(value1.equals(value2));
	}
	
	public void display1(ArrayList<? extends Number> list) {
		for (Number number : list) {
			System.out.println(number);
		}
	}
	
	public void display2(ArrayList<? super Number> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	public static void main(String[] args) {
		BoundedTypeClass type=new BoundedTypeClass();
		
//		type.compare("raj","rani");
		type.compare(12, 12);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(29);
		list.add(12);
		type.display1(list);
		
		ArrayList<Number> list2=new ArrayList<Number>();
		list2.add(29);
		list2.add(12.9);
		list2.add(3.14);
		
		type.display1(list2);
		
//		type.display2(list);
		type.display2(list2);
	}
}
