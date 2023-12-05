package com.cnts.collections_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionToArray {
	
	public void arrayListToCollection() {
		List<Integer> myCollection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		
		Integer[] myArray = myCollection.toArray(new Integer[0]);
        System.out.println(Arrays.toString(myArray));
        
        
	}

}
