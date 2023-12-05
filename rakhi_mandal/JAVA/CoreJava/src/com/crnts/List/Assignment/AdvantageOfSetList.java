//Show the advantage of using List and Set classes.
package com.crnts.List.Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class AdvantageOfSetList {

	public static void main(String[] args) {
		AdvantageOfSetList advantageOfSetList =new AdvantageOfSetList();
		advantageOfSetList.displayHasSet();
		advantageOfSetList.displayList();
	}
	public void displayHasSet()
	{
		HashSet<String> hasSet=new HashSet(); //sorts the inputs based on hash number   //accepts one null // no duplicates
		hasSet.add("Zack");
		hasSet.add("Rakhi");
		hasSet.add("jack");
		hasSet.add("jack");
		hasSet.add(null);
//		hasSet.add(null);
		
		Iterator<String> listWithIterator=hasSet.iterator();
		while(listWithIterator.hasNext())
		{
			System.out.println(listWithIterator.next()+" ");
		}
		
	}
	public void displayList()
	{
		ArrayList array =new ArrayList();
		array.add("rakhi");
		array.add("sweta");
		array.add("joe");
		array.add(0, "hh");
		array.add(9);
		System.out.println(array);
		
	}

}
