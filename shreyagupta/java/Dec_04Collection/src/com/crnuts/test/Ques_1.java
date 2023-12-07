package com.crnuts.test;

import java.util.HashSet;
import java.util.Set;

public class Ques_1 {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(45);
		set.add(98);
		set.add(33);
		set.add(98);
		
		for(Integer integer:set) {
			System.out.print(integer+" ");
		}
		
	}

}
