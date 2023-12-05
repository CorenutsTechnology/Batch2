package com.cnts.collections_30;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
	
	public void display() {
		List l1=new ArrayList();
		l1.add(10);
		l1.add("swathi");
		l1.add(20);
		l1.add(23.78);
		l1.add("mysore");
		double sum=0;
		
		for(Object element:l1) {
			 if (element instanceof Number) {
				 sum=sum+((Number)element).doubleValue();
	            }
		}
		System.out.println(sum);
		
	
	}
	
	public static void main(String[] args) {
		arraylist a1 = new arraylist();
		a1.display();
		
		
	}

}
