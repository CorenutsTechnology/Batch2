package com.crnt.test.nov;

public class Constructor_overloading_23 {
	Constructor_overloading_23(){
		this('A',"ABCD");
		System.out.println("default ");
	}
Constructor_overloading_23(int value){
	this("DHD");
	System.out.println("INT ");
	}
Constructor_overloading_23(int value,String value1){
	System.out.println("INT AND STRING ");
}
Constructor_overloading_23(String value1){
	System.out.println("  STRING ");
}
Constructor_overloading_23(char value,String value1){
	System.out.println("CHAR AND STRING ");
}
public static void main(String[] args) {
//	Constructor_overloading_23 constructor_overloading_23=new Constructor_overloading_23();
//	Constructor_overloading_23 constructor_overloading_23_1=new Constructor_overloading_23(1);

	Static_variable static_variable=new Static_variable(20);
	
	System.out.println(static_variable.value);
}
}
class Static_variable{
	static int value;
	Static_variable(int value){
	this.value=value;
//		value=value;
		System.out.println(value);
	}
}
