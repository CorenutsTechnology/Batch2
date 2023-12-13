package com.feuji30nov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortElements 
{
	public void sortElements(List<ProductDetails> list)
	{
		Collections.sort( list);
	   Iterator<ProductDetails>iterator=list.iterator();
	   while(iterator.hasNext()) {
		   System.out.println(iterator.next());
	   }
	}
   public static void main(String[] args) 
   {
	   SortElements sort=new SortElements();
	   List<ProductDetails> list=new ArrayList<>();
	   list.add(new ProductDetails("HP", 40000,"Laptop"));
	   list.add(new ProductDetails("OnePlus", 20000,"Phone"));
	   list.add(new ProductDetails("MI", 100000,"Tv"));
	   list.add(new ProductDetails("LG", 70000,"firdge"));
	   sort.sortElements(list);
	
}
}
