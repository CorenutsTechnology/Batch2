package com.cnts.nov28.genric;

import java.util.ArrayList;

public class Genric1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Anisha");
		list.add("CoreNuts");
		list.add("Feuji");
//		list.add(32);         //this line will give compile time error 
		                     //one advantage is type safty we cant store integer object 
		                      //in string arraylist
	String str1 = (String)list.get(3);	
		for(String str : list)
		{
			System.out.println(str);
		}
	}
}
