package com.cnts.Strings_24;

public class CountRepeatedCharacters {
    public static void main(String[] args) {
        String inputString = "CoreNuts Technologies Pvt ltd.";
        countAndPrintRepeatedCharacters(inputString);
    }

    static void countAndPrintRepeatedCharacters(String str) {
        str = str.toLowerCase();
        int[] charCount = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar >= 0 && currentChar <= 255) {
                charCount[currentChar]++;
            }
        }
        System.out.println("Original string: " + str);
        System.out.println("Repeated characters and their counts:");

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                char repeatedChar = (char) i;
                System.out.println(repeatedChar + ": " + charCount[i]);
            }
        }
    }
}

