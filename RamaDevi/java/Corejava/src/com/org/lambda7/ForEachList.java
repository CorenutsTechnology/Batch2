package com.org.lambda7;

import java.util.ArrayList;
import java.util.List;

public class ForEachList {

	public static void main(String[] args) {
		List <String>l=new ArrayList();
		l.add("one");
		l.add("two");
		l.add("three");
		l.forEach((e)->System.out.println(e));
		
				
	}

}
