//calling method inside constructor

package com.crnts.access_modifier;

  class Default_Class {
      int id=2;
      String name="rakhi";
      
      public static void display()
      {
    	  System.out.println("From default class");
      }
     
    
	public Default_Class(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		Default_Class.display();   //method should be static
	}
     
}
