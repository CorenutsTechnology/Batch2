package com.cnts.classprogram;

class SuperClass
{
 void superClassMethod(Number n)
 {
 System.out.println("From Super Class");
 }
}
class SubClass extends SuperClass
{
 void superClassMethod(Double d)
 {
 System.out.println("From Sub Class");
 }
}
public class Test1 {
public static void main(String[] args)
 {
 SubClass sub = new SubClass();
 sub.superClassMethod(123321);
 }
}