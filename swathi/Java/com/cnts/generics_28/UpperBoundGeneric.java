package com.cnts.generics_28;

import java.util.ArrayList;
import java.util.List;

import org.junit.platform.commons.util.StringUtils;

public class UpperBoundGeneric<T> {
	
	public void display(ArrayList<? extends Number> list) {
		//This list will accept any Number related elements
		//System.out.println("This list will accept any Number related elements");
		for(Number values:list) {
			System.out.println(values);
		}
		
	}
	public  double sum(ArrayList <? extends Number>list1) {
		double sum=0.0;
		for(Number values : list1) {
			sum=sum+values.doubleValue();
		}
		return sum;
		
	}
	
	public void displayList(List<?> list2) {
		System.out.println(list2);
	}
	
//	String name="swathi";
//	String replaced=StringUtils.

}
