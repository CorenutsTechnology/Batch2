//1. Write a program to find the count of each word in a given String value.
//String str = "Core nuts technologies located in Bangalore Core nuts technologies
//		located in hyderabad Core nuts technologies in Hyderabad Core nuts technologies in
//		Bangalore";
package com.crnts.thread_2;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;

public class Find_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_count find_count = new Find_count();
		find_count.coutWords();

	}

	public void coutWords() {
		String str = "Core nuts technologies located in Bangalore Core nuts technologies located in hyderabad Core nuts technologies in Hyderabad Core nuts technologies in Bangalore";
		String[] strArray = str.split(" ");
//		System.out.println(strArray[8]);
		Map<String, Integer> map = new HashMap<>();
		int temp = 0;
		for (String e : strArray) {
			if (map.containsKey(e)) {
				temp = map.get(e);
				temp++;
				map.put(e, temp);
			} else {
				map.put(e, 1);
			}
			
		}
		for(Entry<String, Integer> e: map.entrySet())
		{
			System.out.println(e.getKey() +" - " + e.getValue());
		}
		

	}

}
