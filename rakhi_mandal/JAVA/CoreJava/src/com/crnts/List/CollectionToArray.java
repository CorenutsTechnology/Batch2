//2. Write a program to convert a collection to an array?
package com.crnts.List;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {
	

	public static void main(String[] args) {
		CollectionToArray collectionToArray=new CollectionToArray();
		collectionToArray.convertCollectionToArray();
	}
	public void convertCollectionToArray()
	{
		List<String> list=new ArrayList<>();
		list.add("rakhi");
		list.add("neha");
		list.add("swati");
		
		Object[] array=list.toArray();
		
		for(Object item:array)
		{
			System.out.print(item+" ");
		}
		System.out.println(array);
	}


}
