 package com.feuji12dec;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfNumbers 
{
	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//add 5 to each element.
		list.stream().map((e)->e+5).collect(Collectors.toList()).forEach((e)->System.out.println(e));
		
		//find sum of the elements.
		int res=list.stream().mapToInt((e)->e).sum();
		System.out.println("Sum:"+res);
		
	}

}
