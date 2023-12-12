//Add 5 to each element in the integer list. For example, if the input is 1,2,3,4,5, the output should be 6,7,8,9,10?
package com.crnts.streams;

import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		IntegerList integerList =new IntegerList();
		integerList.displayUsingForEach();
		integerList.displayUsingForEach_Map();
	

	}
	public void displayUsingForEach()
	{   ArrayList<Integer> numList=new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		
		numList.stream().forEach((e)->System.out.println(e+5)); 
		
	}
	public void displayUsingForEach_Map()
	{   ArrayList<Integer> numList=new ArrayList<>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		
	   numList.stream().map((e)->e+5).forEach((e)->System.out.println(e)); 
	}

}
