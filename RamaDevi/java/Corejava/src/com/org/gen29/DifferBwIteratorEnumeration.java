package com.org.gen29;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.junit.platform.commons.util.StringUtils;

public class DifferBwIteratorEnumeration {
	public static void main(String[] args) {
		Vector enums = new Vector();
		enums.add("keerthi");
		enums.add("hari");
		enums.add("lukky");
		enums.add("krithi");
		// Create Enumeration
//		Enumeration<String> enumr = Collections.enumeration(enums);
//		System.out.println("The Enumeration List are: ");
//		while (enumr.hasMoreElements()) {
//			System.out.println(enumr.nextElement());
//		}
			System.out.println("--------");
			Iterator <String>iterate=enums.iterator();
			while(iterate.hasNext())
			{
				String name=iterate.next();
				System.out.println(name);
			}
		
	}
}
