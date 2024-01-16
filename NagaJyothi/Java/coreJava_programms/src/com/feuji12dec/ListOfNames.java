package com.feuji12dec;

import java.util.ArrayList;
import java.util.List;

public class ListOfNames 
{
	public static void main(String[] args)
	{
		List<String> names=new ArrayList<>();
		names.add("Jyothi");
		names.add("indu");
		names.add("puri");
		names.add("supriya");
		names.add("padma");
		
		long res=names.stream().sorted().count();
		System.out.println(res);
		List<Integer> value=new ArrayList<>();
		value.add(10);
		value.add(11);
		value.add(21);
		
		value.stream().map(e->(e+" ")).filter((e)->e.startsWith("1"))
		.forEach((e)->System.out.println(e));

		
		
		
	}

}
