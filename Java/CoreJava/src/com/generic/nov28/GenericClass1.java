//1. Write a program to show advantage of using generics. Show the problem and give the solution for that using generic concept.

package com.generic.nov28;

import java.util.ArrayList;
import java.util.List;

import com.singletonclass.nov27.SingleTon;

public class GenericClass1 
{	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(new SingleTon());
		list.add("Hello");
		System.out.println(list);
		display(list);
	}
	public static void display(ArrayList<Integer> list)
	{
		for(Integer obj : list)
		{
			System.out.println(obj);
		}
	}
}
