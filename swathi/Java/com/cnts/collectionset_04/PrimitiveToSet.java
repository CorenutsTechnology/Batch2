package com.cnts.collectionset_04;

import java.util.HashSet;

public class PrimitiveToSet {
	
	public void displayElements() {
		HashSet<Number> hashSetValues = new HashSet<Number>();
		hashSetValues.add(123);
		hashSetValues.add(234.67);
		hashSetValues.add(145.6789f);
		hashSetValues.add(123456789l);
	
		
		
		for(Number set:hashSetValues) {
			System.out.println(set);
		}
		
		
	}

}
