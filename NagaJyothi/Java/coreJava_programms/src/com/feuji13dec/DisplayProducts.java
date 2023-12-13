package com.feuji13dec;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.feuji5dec.GetValues;

public class DisplayProducts 
{
	public static void main(String[] args) {
		List<Product> list=new ArrayList<>();
		list.add(new Product("mango",100.0));
		list.add(new Product("Apple",200.0));
		list.add(new Product("Bananna",50.0));
		list.add(new Product("Grapes",100.0));
		list.add(new Product("Cherry",250.0));
		list.add(new Product("Orange",150));
	   list.stream().filter((e)->e.getPrice()<=300).collect(Collectors.toList())
	  .stream().forEach((e)->System.out.println(e));
	   System.out.println("------");
	   list.stream().filter((e)->e.getPrice()<=300).collect(Collectors.toMap((e)->e.getName(), (e)->e.getPrice()))
	   .entrySet().stream().forEach((e)->System.out.println(e));
		
	}

}
