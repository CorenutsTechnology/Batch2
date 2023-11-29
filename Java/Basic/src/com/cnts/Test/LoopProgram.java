package com.cnts.Test;

public class LoopProgram {

    public static void printPattern(int patternValue) {
        int outerIndex, innerIndex;
        int num = 1;
        for (outerIndex = 1; outerIndex <= patternValue; outerIndex++) {
            for (innerIndex = 1; innerIndex <= outerIndex; innerIndex++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int patternValue = 5;
        printPattern(patternValue);
    }
}