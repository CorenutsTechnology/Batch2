package com.org.gen29;

import java.util.ArrayList;
import java.util.List;

public class GenTest {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList();
	list.add(10);
	list.add(20);
	list.add(20);
	list.add(40);
	GenTest gen=new GenTest();
	gen.display(list);
	
}
public void display(ArrayList<Integer> list)
{
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
	list.add(70);
	System.out.println(list.size());
	
//	for(Integer obj:list)
//	{
//		System.out.println(obj);
//	}
}
}
