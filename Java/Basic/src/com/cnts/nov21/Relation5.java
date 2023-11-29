package com.cnts.nov21;

class Vehicle 
{
 void display() {
     System.out.println("This is a vehicle");
 }
}

//Sub-class demonstrating IS-A relationship
class Car2 extends Vehicle 
{
 void drive() 
 {
     System.out.println("Car is being driven");
 }
}

//Class demonstrating HAS-A relationship
class Engine 
{
 void start() 
 {
     System.out.println("Engine started");
 }
}

class CarWithEngine
{
 // HAS-A relationship - Car has an Engine
 Engine carEngine = new Engine();
 
 void startCar() {
     carEngine.start();
     System.out.println("Car started");
 }
}

//Main class
public class Relation5 
{
 public static void main(String[] args) {
     // IS-A relationship
     Vehicle vehicle = new Car2(); // Upcasting
     vehicle.display(); 
     // vehicle.drive(); // This line would cause a compilation error 
     //because the reference is of type Vehicle.

     // HAS-A relationship
     CarWithEngine carWithEngine = new CarWithEngine();
     carWithEngine.startCar(); 
 }
}

