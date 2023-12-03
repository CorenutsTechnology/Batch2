package com.cnts.nov27.wrraperclass;

public class PrimitiveWrapperConversion {

    public static void main(String[] args) {
        // Convert primitive to wrapper
        int primitiveInt = 42;
        Integer wrapperInt = Integer.valueOf(primitiveInt);

        // Convert wrapper to primitive
        double primitiveDouble = wrapperInt.doubleValue();

        // Display the results
        System.out.println("Primitive to Wrapper: " + primitiveInt + " -> " + wrapperInt);
        System.out.println("Wrapper to Primitive: " + wrapperInt + " -> " + primitiveDouble);
    }
}

