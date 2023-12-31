//in upper bond we use extend keyword and ? is a wild card
package com.generic.nov28;

import java.util.ArrayList;

public class UpperBound 
{
	
	public void display2(ArrayList<? super Number> list)
	{
		System.out.println("lower bound");
		System.out.println(list);
	}
	
	
	public void display(ArrayList<? extends Comparable> list)
	{
		System.out.println(list);
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		UpperBound obj = new UpperBound();
		obj.display(list);
//		ArrayList<Bound4> list2 = new ArrayList<>();
//		list2.add(new Bound4());
//		list2.add(new Bound4());
//		list2.add(new Bound4());
//		obj.display(list2); it is not possible because Bound4 class is not extends Comparable interface
		
		ArrayList<Number> list2 = new ArrayList<>();
		obj.display2(list2);
//		ArrayList<Integer> list3 = new ArrayList<>();
//		obj.display2(list3); 
//		this is not possible ,because the display2() islower bound method which accepts only
//		number and its parent types, but not its child types
	}

}
