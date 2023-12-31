//4. Create a program to add primitive data type elements to arraylist object and display the elements 
//using for loop and Iterator interface.
package com.collections.nov30;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintPrimitives4
{
	public String print()
	{
		try {
			ArrayList aList= new ArrayList();
			aList.add('c');
			aList.add(23.45);
			aList.add(10);
			aList.add(25.3f);
			
			System.out.println("printing using for loop:");
			for(Object object: aList)
			{
				System.out.print(object+" ");
			}
			
			System.out.println("\nprinting using iterator loop:");
			Iterator iterator = aList.iterator();
			while(iterator.hasNext())
			{
				System.out.print(iterator.next()+" ");
			}
			System.out.println();
			
			return "success";
		}catch(Exception e)
		{
			return "failed";
		}
	}
}
