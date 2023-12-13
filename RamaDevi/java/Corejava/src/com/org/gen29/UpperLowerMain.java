package com.org.gen29;

import java.util.ArrayList;

public class UpperLowerMain {

	public static void main(String[] args) {
		UpperBoundLowerBound upperLower=new UpperBoundLowerBound();
		upperLower.compare(new String("ram"),new String("raj"));
		ArrayList<Integer> integerlist=new ArrayList<>();
		integerlist.add(10);
		integerlist.add(30);
		upperLower.display(integerlist);
		
		ArrayList<Number> doublelist=new ArrayList();
		doublelist.add(39.7);
		doublelist.add(269.7);
		upperLower.display(doublelist);
		
	}

}
