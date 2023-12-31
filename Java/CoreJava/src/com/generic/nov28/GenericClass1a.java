package com.generic.nov28;

import java.util.ArrayList;

public class GenericClass1a {

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
//		list.add("string");
		list.add(200);
		list.add(300);
		list.add(400);
		GenericClass1a obj = new GenericClass1a();
		obj.display(list);
	}
	public void display(ArrayList<Integer> list)
	{
		for(Integer obj : list)
		{
			System.out.println(obj);
		}
	}

}
