package com.org.stream12;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllElements {

	public static void main(String[] args) {
		List<Integer> listint= new ArrayList();
		listint.add(3);
		listint.add(5);
		listint.add(6);
		listint.add(8);
		listint.add(2);
//		IntSummaryStatistics l=listint.stream().collect(Collectors.summarizingInt(e->e));
//		System.out.println(l);
		int listvalue=listint.stream().reduce(0,(a,b)->a+b);
		System.out.println(listvalue);

	}

}
