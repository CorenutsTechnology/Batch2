package com.crnuts.classes;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LearningStream {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		Random r = new Random();
		for (int i = 1; i <= 10000; i++) {            //1
			arrayList.add(r.nextInt(10000));

		}

		long time1 = System.currentTimeMillis();
		long sum=0;
		List<Integer> evenArrayList = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {             //2
			if (arrayList.get(i) % 2 == 0) {
				evenArrayList.add(arrayList.get(i));
				sum=sum+arrayList.get(i);
			}
		}
		System.out.println("sum: "+sum);
		
//		for(Integer i: evenArrayList) {
//		System.out.print(i+" ");
//	}

		//System.out.println(evenArrayList.size());

		//System.out.println("\n");
		
		long time2 = System.currentTimeMillis();

		System.out.println("time difference 1: " + (time2 - time1));
		
		long time3 = System.currentTimeMillis();


		long evenStreamSum = arrayList.stream().filter(i -> i % 2 == 0).
				reduce(0,(a,b)-> a+b);
		
		System.out.println("sum using stream: "+evenStreamSum);
		
//		for(Integer i: evenStream) {
//			System.out.print(i+" ");
//		}

		long time4 = System.currentTimeMillis();

		System.out.println("time difference 2: " + (time4 - time3));

	}

}
