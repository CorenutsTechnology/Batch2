package com.feuji30nov;

import java.util.ArrayList;
import java.util.List;

public class PrintCollectionTest 

{
	public static void main(String[] args) 
	{
		PrintCollection print =new PrintCollection();
		List<Product>list=new ArrayList<>();
		list.add(new Product("Laptop",30000));
		list.add(new Product("Tv", 100000));
		list.add(new Product<Integer>(10, 123457));
		list.add(new Product<String>("Projector", "fifty Thousand"));
		print.printElemnts(list);
		ArrayList<Integer>list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(0,50);
		//list1.add(10,100);
		list1.set(10, 150);
		//list1.set(1, 25);
		System.out.println(list1);


		
	}

}
