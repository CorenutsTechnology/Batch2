package com.org.thread6;

import java.util.HashMap;
import java.util.Map;

public class StringMap {

	public static void main(String[] args) {
		String str="Core nuts technologies located in Bangalore Core nuts technologies located in hyderabad Core nuts technologies in Hyderabad Core nuts technologies in Bangalore";


	String[] strarr=str.split(" ");
	Map <String,Integer> mapValue=new HashMap();

//	for(int i=0;i<strarr.length;i++)
//	{
//		String s=strarr[i];
//		if(mapValue.containsKey(s))
//		{
//			int count=mapValue.get(s);
//			count++;
//			 mapValue.put(s, count);
//		}
//		else
//		{
//			mapValue.put(s,1);
//		}
//	}
//		
//	for(Map.Entry<String,Integer> e:mapValue.entrySet()) {
//		System.out.println(e);
//	}
//	
	for (String word : strarr) {
		 
        // Asking whether the HashMap contains the
        // key or not. Will return null if not.
        Integer integer = mapValue.get(word);

        if (integer == null)
            // Storing the word as key and its
            // occurrence as value in the HashMap.
            mapValue.put(word, 1);

        else {
            // Incrementing the value if the word
            // is already present in the HashMap.
            mapValue.put(word, integer + 1);
        }
    }
    System.out.println(mapValue);
}
}