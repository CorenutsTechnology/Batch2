package com.cnts.nov16;


interface MyInterface 
{
 void myMethod();             //interface
}

//Create an abstract class implementing the interface but not providing method implementations
abstract class AbstractClass implements MyInterface
{
 // This class doesn't provide an implementation for myMethod
}

//Create a concrete class that extends the abstract class and provides implementations
class ConcreteClass extends AbstractClass {
 @Override
 public void myMethod()
 {
     System.out.println("Implementation of myMethod in MyConcreteClass");
 }
}


public class Main6
{
 public static void main(String[] args) {
     
     ConcreteClass concreteObject = new ConcreteClass(); // Create an instance of the concrete class
     concreteObject.myMethod();
 }
}

