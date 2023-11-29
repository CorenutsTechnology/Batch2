package com.crnt.string.nov2423;

import java.util.Scanner;

public class StringTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String userInput = scanner.nextLine();

        if (isNumeric(userInput)) {
            System.out.println(userInput + " is an integer.");
        } else {
            System.out.println(userInput + " is a string.");
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
