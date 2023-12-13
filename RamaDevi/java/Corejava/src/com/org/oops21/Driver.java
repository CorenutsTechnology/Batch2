package com.org.oops21;

public class Driver {
	public static void main(String[] args) {
		
Car car=new Car();
car.airbags();
car.drive(); 
System.out.println("***");
Maruthi maruthi=new Maruthi();
maruthi.airbags();
maruthi.drive();
System.out.println("***");
Car car1=new Audi();
car1.airbags();
car1.drive();
System.out.println("***");
//***** classCastException******
//Audi audi=(Audi) new Car();
//audi.drive();
System.out.println("***");
//Audi audi1=new Maruthi();
	}
}
