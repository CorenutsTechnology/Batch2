package com.set.dec4;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
public class PrimitiveSet 
{
	public void method()
	{
		Set set = new HashSet();
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(9);
		set.add(15);
		set.add(6);
		
		TreeSet set2 = new TreeSet(set);
		System.out.println("elements in sorted order:");
		set2.stream().forEach(System.out::println);	  
	}
	public static void main(String[] args) {
		PrimitiveSet primitiveSet =  new PrimitiveSet();
		primitiveSet.method();
	}
}
