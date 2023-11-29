package com.crnuts.genericsTest;

import java.util.ArrayList;

//-------------Ques 2------------------

import com.crnuts.genericClass.GenericClass;

public class GenericClassTest {

	public static void main(String[] args) {
	
		GenericClass<Character> class1=new GenericClass ("SQL", 'a');
		
	   char ch=class1.getT1();
	   System.out.println(ch);
	   
	  
	    

	}

}
