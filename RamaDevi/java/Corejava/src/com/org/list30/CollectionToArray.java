package com.org.list30;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {

	public static void main(String[] args) {
		// creating arraylist obejct for list
		List<String> list = new ArrayList();
		// Adding elements into list
		list.add("hari");
		list.add("bhanu");
		list.add("chandu");
		// Finding the length of list
		int length = list.size();
		// creating StringArray
		String[] strArray = new String[length];
		// iterating the stringArray
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = list.get(i);
		}
		// displaying the arrayelements
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

	}

}
