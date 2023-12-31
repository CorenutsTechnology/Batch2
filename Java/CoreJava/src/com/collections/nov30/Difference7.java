//7. Write a program to show difference between Iterator and Enumeration
package com.collections.nov30;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Difference7 
{
	public String show()
	{
		Vector<Integer> vector = new Vector<>(10,12);//four constructors are there for vector
		vector.add(10);
//		vector.addLast(20);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		System.out.println(" enumerator in vector");
		Enumeration<Integer> enumerator = vector.elements();
		while(enumerator.hasMoreElements())
		{
			System.out.println(enumerator.nextElement());
		}
		System.out.println(" Iterator in vector");
		Iterator iterator = vector.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
//			iterator.remove(); this method is not there in enumeration
		}
		return "success";
	}
	public static void main(String[] args) {
		Difference7 difference7 = new Difference7();
		difference7.show();
	}
}
