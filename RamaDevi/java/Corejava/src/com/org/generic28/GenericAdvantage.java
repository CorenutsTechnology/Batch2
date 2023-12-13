package com.org.generic28;

import java.util.ArrayList;

public class GenericAdvantage {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(null);
		list.add(100);
		list.add(300);
		//list.add("100");
		
//		for(Integer i:list)
//		{
//			System.out.println(i);
//		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}

}
