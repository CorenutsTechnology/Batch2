package com.org.map5;

import java.util.Comparator;

public class LocationCompare implements Comparator <Employee>{

	@Override
	public int compare(Employee l1, Employee l2) {
		
		return l1.getLocation().compareTo(l2.getLocation());
	}

	

}
