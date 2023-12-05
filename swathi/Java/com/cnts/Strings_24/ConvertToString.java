package com.cnts.Strings_24;
//program12
public class ConvertToString {
    public static void main(String[] args) {
       
        int intValue = 42;
        double doubleValue = 3.14;
        char charValue = 'A';
        boolean booleanValue = true;
        long longValue = 123456789L;
        float floatValue = 2.5f;
        short shortValue = 123;

       
        String strInt = String.valueOf(intValue);
        String strDouble = String.valueOf(doubleValue);
        String strChar = String.valueOf(charValue);
        String strBoolean = String.valueOf(booleanValue);
        String strLong = String.valueOf(longValue);
        String strFloat = String.valueOf(floatValue);
        String strShort = String.valueOf(shortValue);

        System.out.println("Converted Strings:");
        System.out.println("int: " + strInt);
        System.out.println("double: " + strDouble);
        System.out.println("char: " + strChar);
        System.out.println("boolean: " + strBoolean);
        System.out.println("long: " + strLong);
        System.out.println("float: " + strFloat);
        System.out.println("short: " + strShort);
    }
}
