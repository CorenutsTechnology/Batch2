package com.cnts.nov23;

//parent class
class Vehicle 
{
    String type;
    
    Vehicle(String type)
    {
        this.type = type;
        System.out.println("Vehicle constructor with type: " + type);
    }
}

class Car extends Vehicle 
{
    int numWheels;
    
    Car(String type, int numWheels) 
    {
        super(type); // Calling the constructor of imedate parent class
        this.numWheels = numWheels;
        System.out.println("Car constructor with " + numWheels + " wheels");
    }
}

class SportsCar extends Car
{
    boolean turbo;
   
    SportsCar(String type, int numWheels, boolean turbo) 
    {
        super(type, numWheels); // Calling the constructor of the immediate base class
        this.turbo = turbo;
        System.out.println("SportsCar constructor with turbo: " + turbo);
    } 
}

public class ConstructerChaining2
{
    public static void main(String[] args)
    {
        SportsCar mySportsCar = new SportsCar("Sports", 4, true);
        System.out.println("Type of the SportsCar: " + mySportsCar.type);
    }
}

//we cant use this calling statement and super calling statement at a same time 
//but we can use super calling statement and this key-word same time


