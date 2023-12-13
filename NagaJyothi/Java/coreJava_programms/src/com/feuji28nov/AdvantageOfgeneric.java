package com.feuji28nov;

import java.util.ArrayList;
import java.util.Iterator;

import com.feuji.bean.Student;

public class AdvantageOfgeneric 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		//list.add(22.4);
		//list.add(new Student());
		//list.add(new EmployeeClass());
		System.out.println(list);
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}

}
