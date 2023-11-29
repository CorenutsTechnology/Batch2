package com.cnts.nov27.wrraperclass;

public class WrapperClass1 {
    public static void main(String[] args) {
        // Integer Wrapper Class
        Integer intObj = 42;

        // Utility functions for Integer
        System.out.println("Integer Wrapper Class:");
        System.out.println("Value: " + intObj);
        System.out.println("Binary: " + Integer.toBinaryString(intObj));
        System.out.println("Hex: " + Integer.toHexString(intObj));
        System.out.println("Octal: " + Integer.toOctalString(intObj));
        System.out.println("Max Value: " + Integer.MAX_VALUE);
        System.out.println("Min Value: " + Integer.MIN_VALUE);
        System.out.println();

        // Double Wrapper Class
        Double doubleObj = 3.14;

        // Utility functions for Double
        System.out.println("Double Wrapper Class:");
        System.out.println("Value: " + doubleObj);
        System.out.println("Exponential: " + Double.toHexString(doubleObj));
        System.out.println("Max Value: " + Double.MAX_VALUE);
        System.out.println("Min Value: " + Double.MIN_VALUE);
        System.out.println();

        // Boolean Wrapper Class
        Boolean boolObj = true;

        // Utility functions for Boolean
        System.out.println("Boolean Wrapper Class:");
        System.out.println("Value: " + boolObj);
        System.out.println("HashCode: " + boolObj.hashCode());
        System.out.println("String Value: " + boolObj.toString());
    }
}
