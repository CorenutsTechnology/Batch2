package com.cnts.nov24;

public class Count11
{
    public static void main(String[] args)
    {
        String inputString = "programming";

     
        inputString = inputString.toLowerCase();

        // Array to store the count of each character (assuming ASCII characters)
        int[] charCount = new int[128];

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) 
        {
            char currentChar = inputString.charAt(i);

            // Increment the count of the current character
            charCount[currentChar]++;
        }

        // Display the count of repeated characters
        System.out.println("Repeated characters in the string:");
        for (int i = 0; i < charCount.length; i++) 
        {
            if (charCount[i] > 1) 
            {
                System.out.println((char) i + ": " + charCount[i] + " times");
            }
        }
    }
}

