package com.org.check;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
        int array[] = new int [5];
        for (int i = 5; i > 0; i--)
            array[5-i] = i;
        Arrays.fill(array, 1, 4, 8);
//        for (int i = 0; i < 5 ; i++)
//            System.out.print(array[i]);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        
	}

}
