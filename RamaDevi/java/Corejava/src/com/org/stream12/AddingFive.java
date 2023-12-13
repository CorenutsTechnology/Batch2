package com.org.stream12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddingFive {

	public static void main(String[] args) {
		List<Integer> listint= new ArrayList();
		listint.add(3);
		listint.add(5);
		listint.add(6);
		listint.add(8);
		listint.add(2);
		List<Integer> l=listint.stream().map((e)->e+5).collect(Collectors.toList());
		l.forEach(e->System.out.println(e));
	}

}
