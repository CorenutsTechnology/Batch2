package com.cnts.nov24;

public class DeleteSubstring8 {
    public static void main(String[] args) 
    {
 
        String inputString = "CoreNuts Technologies Pvt ltd.";

      
        String substringToDelete = "Technologies";

        // Using StringBuffer to delete the substring
        StringBuffer stringBuffer = new StringBuffer(inputString);

        // Find the index of the substring to be deleted
        int index = stringBuffer.indexOf(substringToDelete);

        // Delete the substring if found
        if (index != -1) 
        {
            stringBuffer.delete(index, index + substringToDelete.length());
            System.out.println("Original String: " + inputString);
            System.out.println("String after deletion: " + stringBuffer.toString());
        } 
        else 
        {
            System.out.println("Substring not found in the original string.");
        }
    }
}
