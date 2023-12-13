package com.org.list30;

import java.util.LinkedList;
import java.util.List;

import com.org.gen29.Product;

public class PrintList {

	public static void main(String[] args) {
		List list=new LinkedList();
		list.add(new Product("tv"));
		list.add("Raju");
		list.add(null);
		list.add(10);
		//System.out.println(list);
		
		int length=list.size();
		for(Object obj:list)
		{
			System.out.println(obj);
		}
//		
//		System.out.println(new Integer(5)==5);
//		Integer i=1000;
//		Integer i1=1000;
//		System.out.println(i==i1);
//		System.out.println("----");
//		System.out.println(Integer.valueOf(10)+Integer.valueOf(20));
//		Integer num=null;
//		int reul=num+5;
//		System.out.println(reul);
	}

}
