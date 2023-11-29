package com.crnt.test.nov;

public class MultiLevelInheritance_21 {
public static void main(String[] args) {
	Class3 class3=new Class3();
	class3.Class1();
	class3.Class2();
	class3.Class3();
	
}
}
class Class1{
	void Class1() {
		System.out.println("class1");
	}
}
class Class2 extends Class1{
	void Class2() {
		System.out.println("class2");
	}
}
class Class3 extends Class2{
	
	void Class3() {
		super.Class2();
		System.out.println("class3");
	}
}