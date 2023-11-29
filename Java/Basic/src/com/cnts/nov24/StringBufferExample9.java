package com.cnts.nov24;

public class StringBufferExample9 {
    public static void main(String[] args) {
        // Original string
        StringBuffer originalString = new StringBuffer("CoreNuts Pvt ltd.");

        // String to insert
        String stringToInsert = "Technologies";

        // Index where we want to insert the new string
        int insertIndex = originalString.indexOf("CoreNuts") + "CoreNuts".length();

        // Insert the new string
        originalString.insert(insertIndex, stringToInsert);

        // Display the modified string
        System.out.println("Modified String: " + originalString);
    }
}

