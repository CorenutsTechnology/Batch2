//Create a list of names and find the number of records using streams?
package com.crnts.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class NameList {

	public static void main(String[] args) {
		NameList nameList =new NameList();
		nameList.displayLanguages();
    
     }
	public void displayLanguages()
	{
		 ArrayList<String> languages=new ArrayList<>();	
	     languages.add("Odia");
	     languages.add("Hindi");
	     languages.add("Tamil");
	     languages.add("Hindi");
	     languages.add("Bengali");
	     languages.add("Telugu");
//	     System.out.println(languages.stream().count());
	       Stream<String> count = languages.stream(); 
//	       count.forEach((e)->System.out.println(e));
	       count.filter(i->i.equals("Hindi"));
	       
	       
	       
	}

}
