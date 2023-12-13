package com.feuji30nov;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArrayTest 
{
	public static void main(String[] args) 
	{
		ArrayListToArray arrayList=new ArrayListToArray();
		List  list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(45);
		list.add(67);
		arrayList.<Integer>convert(list);
		
		//Print collection elemnts.......
		PrintCollection elements=new PrintCollection();
		elements.printElemnts(list);
		
	}

}
