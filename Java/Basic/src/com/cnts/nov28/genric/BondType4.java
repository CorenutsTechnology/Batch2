package com.cnts.nov28.genric;

public class BondType4 {

   
    public static <T extends Number> void displayNumber(T number) 
    {
        System.out.println("Type: " + number.getClass().getName());
        System.out.println("Value: " + number);
    }

    public static void main(String[] args) {
        // Integer
        displayNumber(42);

        // Double
        displayNumber(3.14);

         // String 
        // displayNumberInfo("Hello"); // Compilation error
        //The method displayNumberInfo(T) in the type GenericExample is not 
        //applicable for the arguments (String)
    }
}

