package com.crnts.map;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void displayHasSet()
	{
		HashSet<Employee_P6> hasSet=new HashSet(); //sorts the inputs based on hash number   //accepts one null // no duplicates
		hasSet.add(new Employee_P6(1,"Zack","developer","Pune"));
		hasSet.add(new Employee_P6(12,"Tom","tester","Pune"));
		hasSet.add(new Employee_P6(7,"Zack","developer","Pune"));
		hasSet.add(new Employee_P6(12,"Tom","tester","Pune"));
		hasSet.add(new Employee_P6(7,"Zack","developer","Pune"));
		hasSet.add(new Employee_P6(12,"Tom","tester","Pune"));
		hasSet.add(new Employee_P6(7,"Zack","developer","Pune"));
		
		hasSet.add(null);
//		hasSet.add(null);
		
		Iterator<Employee_P6> listWithIterator=hasSet.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
		
	}

}
