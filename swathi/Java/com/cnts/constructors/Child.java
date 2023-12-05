package com.cnts.constructors;

import java.io.IOException;

class Parent {
public void m1() throws Exception {
System.out.println("parent class");
}
}
public class Child extends Parent {
public void m1() throws IOException {
System.out.println("child class");
}
public static void main(String[] args) {
Parent c = new Child();
//try {
//  // c.m1();
//} catch (IOException e) {
//e.printStackTrace();
//}
}
}