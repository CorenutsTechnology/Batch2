package com.cnts.nov24;

import java.util.StringTokenizer;

public class TokenizeString7
{
    public static void main(String[] args) 
    {
 
        String inputString = "This is a sample string for tokenization in Java";

        // Using StringTokenizer
        tokenizeUsingStringTokenizer(inputString);

        // Using split method
        tokenizeUsingSplitMethod(inputString);
    }

    private static void tokenizeUsingStringTokenizer(String input)
    {
        System.out.println("Tokenizing using StringTokenizer:");
        // Creating a StringTokenizer with space as the delimiter
        StringTokenizer tokenizer = new StringTokenizer(input, " ");

        // Displaying tokenized strings
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        System.out.println();
    }

    private static void tokenizeUsingSplitMethod(String input) 
    {
        System.out.println("Tokenizing using split method:");

        // Splitting the input string using space as the delimiter
        String[] tokens = input.split(" ");

        // Displaying tokenized strings
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

