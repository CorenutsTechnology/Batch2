package com.feuji_07;

import com.feuji.person_07.Person;

public class Variables_Methods {
	
	static String STRINGVALUE = "Swathi";
    long longValue = 123445;
    float floatValue = 354.89f;
    
    
    public static int SUBTRACTION(int value1,int value2) {
    	int result =value1 +value2;
    	return result;
    }
    public  int addition(int value1,int value2) {
    	int result =value1 +value2;
    	return result;
    }
    
   Person person;
	
	
	public static void main(String[] args) {
		Variables_Methods variableMethods = new Variables_Methods();
		System.out.println(Variables_Methods.STRINGVALUE);
		System.out.println(Variables_Methods. SUBTRACTION(20, 10));
		System.out.println(variableMethods.floatValue);
		System.out.println(variableMethods.longValue);
		System.out.println(variableMethods.addition(10, 20));
	}
}
