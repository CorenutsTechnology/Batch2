package com.crnts.variables;

import com.crnts.variables1.Test_Variables1;

public class Test_Variables {
    static long longValue=400000000;
    int intValue=78;
    public static void main(String[] args) {
		int integerValue=20;
		double doubleValue=5.5;
		System.out.println(integerValue);
		Test_Variables test_variables=new Test_Variables();//Object creation of the same  class.
		test_variables.view();
		System.out.println(test_variables.intValue); //non static members can be accessed by object creation
	}
    
	public void view() {
		System.out.println(longValue);  //Global Variables can be accessed any where in the class
	
//		System.out.println(integerValue);//Local Variables cannot be accessed outside of that method
	 
	    Test_Variables1 test_variables1=new Test_Variables1();
		System.out.println(test_variables1.getValue()); 
	}

	




}
