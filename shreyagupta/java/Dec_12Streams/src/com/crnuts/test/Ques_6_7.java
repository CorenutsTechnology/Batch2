package com.crnuts.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques_6_7 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> ques6 = list.stream().map(i -> i + 5).collect(Collectors.toList());

		System.out.println("Question 6: ");
		ques6.forEach(e -> System.out.println(e));

		int ques7 = list.stream().reduce(0, (i, n) -> i + n);

		System.out.println("Question 7: ");

		System.out.println("sum of Integer value: " + ques7);

	}

}
