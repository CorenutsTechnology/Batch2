package com.cnts.nov14;

import java.util.Random;

public class InfinitLoop {
	public static void main(String[] args) {
		
		int size=25;
		int[] array1 =  new int[size];
		
		Random random = new Random();
		while (true) {
			for(int i=0; i<array1.length; i++)
			{
				array1[i]=random.nextInt(50);
				System.out.println(array1[i]);
			}
		}
		
	}
}
