package com.set.dec4;
import java.util.*;
public class Program10 
{
	public void method()
	{
		Set<Integer> list = new HashSet<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(2);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		
		list.addAll(list2);
		System.out.println("after adding list2 into list1"+list);//1,2,3,4,5,11,13,14,15
		
		list.retainAll(list2);
		System.out.println("sub list is: "+list);//2,11,2,13,14,15
		
	}
	public static void main(String[] args) {
		new Program10().method();
	}
}
