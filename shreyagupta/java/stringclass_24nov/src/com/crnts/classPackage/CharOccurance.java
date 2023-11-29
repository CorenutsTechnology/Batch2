package com.crnts.classPackage;

public class CharOccurance {
	
	public static void main(String[] args) {
        String inputString = "nnncdftfwjw";
        countCharacters(inputString);
    }

    public static void countCharacters(String input) {
       
        input = input.toLowerCase();
        System.out.println("Character counts in the string:");
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == c) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("'" + c + "': " + count);
            }
        }
    }
}


