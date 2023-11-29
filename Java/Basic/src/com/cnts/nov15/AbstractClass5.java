package com.cnts.nov15;

 abstract class AbstractClass5 {
	 
	 int rollno=354;
	 String name = "Anisha";
	 
	 public abstract void display();
	 
	 public void display1()
	 {
		 System.out.println("Concret method in abstract class");
	 }
	 public static void main(String[] args) {
//		AbstractClass5 class5 = new AbstractClass5() {};  //Anonymous Innerclass
//		 AbstractClass5 class5 = new AbstractClass5();  //we cant create a object of abstract class
//		 class5.name;
//		 class5.rollno;
	}
}
