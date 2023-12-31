//6. Show the difference between ArrayList and Vector and LinkedList.
package com.collections.nov30;
import java.util.*;
public class Difference6 
{
	public String display()
	{
		LinkedList<Integer> list1 = new LinkedList<>();//intial capacity for linkedlist is zero , 2 constructors are there for ll
		list1.add(10);
		list1.add(20);
		list1.addLast(100);
		list1.addFirst(0);
		
		System.out.println("linked list is:"+list1);
		System.out.println("first element in linked list is: "+list1.peek());//it returns first element
		
		ArrayList<Integer> list2 = new ArrayList<>(10);//3 constructors
		list2.add(10);
		list2.add(20);
//		list2.addLast(100);
//		list2.addFirst(0);these methods are not there in arraylist
		System.out.println("array list is:"+list2);
		
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
//			enumerator.remove();
		}
		return "success";
	}
	public static void main(String[] args) {
		Difference6 difference6 = new Difference6();
		difference6.display();
	}
}
