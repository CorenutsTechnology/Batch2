package com.cnts.nov17;

public class NullPointer8 {
    public static void main(String[] args) {
        try {
            // Attempting to access a method or property of a null object
            String nullString = null;
            System.out.println(nullString.length());
        } 
        catch (NullPointerException e)
        {
            // Catching the NullPointerException and printing the stack trace
            e.printStackTrace();
        }
    }
}

