package com.cnts.nov16;

public interface Question3 {

	public int  variable =19;
	String string="ABC";
	double variable2=13.8;
}

class SubClass implements Question3
{
	
	public static void main(String[] args) {
		SubClass obj = new SubClass();
//		Question3.variable=45;   //we cant change the value of variable declared in interface 
		                          // bcz by default it is final
	}                             // even if we declaer it as public it will consider it as final variable
}