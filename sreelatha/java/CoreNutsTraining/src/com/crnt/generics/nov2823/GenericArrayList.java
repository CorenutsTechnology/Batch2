package com.crnt.generics.nov2823;

import java.util.ArrayList;

public class GenericArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("lalitha");
		list.add("naga");
		System.out.println(list);
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(423);
		intlist.add(235);
		System.out.println(intlist);
		
		
		GenericArrayList  gList = new GenericArrayList();
		gList.display(list);

	}
	public void display(ArrayList list1)
	{
		
		for(Object obj : list1)
		{
			System.out.println(obj);
		}
	}
		

}
