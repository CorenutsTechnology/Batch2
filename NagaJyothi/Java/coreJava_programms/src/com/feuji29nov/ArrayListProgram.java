package com.feuji29nov;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.feuji23nov.Student;

public class ArrayListProgram <T>
{
	 ArrayList <String>cities=new ArrayList<>();
	 
   
	public String getCity(int index )
	{
		cities.add("Hyd");
		cities.add("pune");
		cities.add("Bengalore");
		cities.add("chennai");
		cities.add("Nodia");
		//cities.add(1);
		return cities.get(index);
	}
	
   public void displayCities()
   {
		/*
		 * for (int i = 0; i <cities.size(); i++) { System.out.println(cities.get(i));
		 * 
		 * }
		 */
	    Iterator<String> iterator=cities.iterator();
	    while(iterator.hasNext())
	    {
	    	System.out.println(iterator.next());
	    }
   }
   public  void checkMethods()
   {
	   ArrayList <String>cities2=new ArrayList<>();
	   cities2.add("Delhi");
	   cities2.add("Agra");
	   cities2.add("jaipur");
	   cities2.add("Panji");
	   System.out.println(cities.add("kolkata"));
	   System.out.println(cities.contains("Hyd"));
	   System.out.println(cities.remove(0));
	   cities.addAll(cities2);
	   System.out.println(cities);
	   System.out.println(cities.equals(cities2));
	   System.out.println(cities.indexOf("Delhi"));
	   System.out.println(cities.isEmpty());
	   System.out.println(cities.size());
	   System.out.println(cities.clone());
	   System.out.println(cities.containsAll(cities2));
	   List <Student> student=new ArrayList<>();
	   student.add(new Student("Jyothi",20,22));
	   System.out.println(student.get(0));
	   
   }
}
