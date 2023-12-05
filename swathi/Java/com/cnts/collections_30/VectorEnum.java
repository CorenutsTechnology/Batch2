package com.cnts.collections_30;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnum {
	
	
	public void printValues() {
		Vector<Integer> v = new Vector();
		
		v.add(13);
		v.add(33);
		v.add(53);
		v.add(43);
		v.add(73);
		
		Enumeration e =v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
			
	}
	

}
