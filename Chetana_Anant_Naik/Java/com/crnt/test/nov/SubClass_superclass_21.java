package com.crnt.test.nov;

public class SubClass_superclass_21 {
	public static void main(String[] args) {
//		SubClass11111  subClass1 =new SubClass11111 ();
//		subClass1.subMethod();
//		subClass1.superMethod();
		
//		SuperClass1 subClass1 =new SubClass11111 ();
//		subClass1.subMethod();
		
		
		SuperClass1 subClass1 =new SubClass11111 ();
		
		SubClass11111  subClass2=(SubClass11111) subClass1;
		subClass2.subMethod();
		subClass2.subMethod();
	}
}
class SuperClass1{
	void superMethod() {
	System.out.println("superMethod");	
	}
}
class SubClass11111 extends SuperClass1{
void subMethod() {
	System.out.println("sub Method");	
	}
}
