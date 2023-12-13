package com.org.gen29;

import java.util.Comparator;

public class NameCompare implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {

		return o1.name.compareTo(o2.name);
//		int com=o1.name.compareTo(o2.name);
//		if(com!=0)
//		{
//			return -com;
//		}
//		return o1.getName() - o2.getName();
	}

}
