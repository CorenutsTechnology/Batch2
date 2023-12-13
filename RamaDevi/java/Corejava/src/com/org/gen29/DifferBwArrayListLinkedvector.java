package com.org.gen29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DifferBwArrayListLinkedvector {
public void arrayListMethod()
{
	List<Integer> arrayList=new ArrayList();
	arrayList.add(10);
	arrayList.add(1, 20);
	arrayList.contains(30);
	arrayList.clear();
	arrayList.containsAll(arrayList);
	arrayList.equals(arrayList);
	//arrayList.get(0);
	arrayList.getClass();
	arrayList.hashCode();
	arrayList.indexOf(arrayList);
	arrayList.isEmpty();
	arrayList.iterator();
	arrayList.lastIndexOf(arrayList);
	//arrayList.remove(0);
	//arrayList.removeAll(arrayList);
	//arrayList.sort(arrayList);
	//arrayList.toArray(arrayList);
	arrayList.size();
	arrayList.subList(0, 2);
	arrayList.set(0,50);
	arrayList.set(1,40);
	System.out.println(arrayList);
	
}
public void linkedListMethod()
{
	List list=new LinkedList();
	list.add(10);
	list.addAll(list);
	list.clear();
	list.contains(list);
	list.containsAll(list);
	//All arraylist methods
	list.equals(list);
	list.get(0);
	list.indexOf(list);
	list.isEmpty();
	list.spliterator();
	list.toString();
	list.toArray();
}
public void vectorMethods()
{
	Vector vector=new Vector();
	vector.add(8);
	vector.add(0, vector);
	vector.addAll(vector);
	vector.addElement(vector);
	vector.capacity();
	vector.clear();
	vector.clone();
	vector.contains(vector);
	vector.contains(vector);
	vector.copyInto(null);
	vector.elementAt(0);
	vector.removeElement(vector);
	vector.setSize(0);
	vector.listIterator(0);
	
}
	public static void main(String[] args) {
		DifferBwArrayListLinkedvector dAlv=new DifferBwArrayListLinkedvector();
		dAlv.linkedListMethod();
	}

}
