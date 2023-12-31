package com.collections.nov30;

import java.util.*;

public class CollectionToArray {
	public String convert()
	{
		try {
			List<Integer> list = new ArrayList();		
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			list.add(50);
//			list.add(1,0);
//			list.set(10,5);
//			list.set(0,1);
			Object[] arr;
			arr = list.toArray();
			System.out.println(Arrays.toString(arr));
//			int[] arr2 = new int[5];
//			int i=0;
//			for(Object obj:arr)
//			{
//				System.out.println(arr2[i++]=(int) obj);
//			}// this is for converting object array to int array
			return "success";

		}catch(Exception e)
		{
			return "failed";
		}
	}
//	public static void main(String[] args) {
//		new CollectionToArray().convert();
//	}
}
