package com.arrays;

public class TwoDimensionArray {

	public static void main(String[] args) {
		twoDimensionArray();
	}
	public static void twoDimensionArray()
	{
		int[][] values=new int[3][];
		values[0]=new int[3];
		values[1]=new int[2];
		values[2]=new int[4];
		
		values[0][0]=10;
		values[0][1]=20;
		values[0][2]=30;
		
		values[1][0]=40;
		values[1][1]=50;

		values[2][0]=60;
		values[2][1]=70;
		values[2][2]=80;
		values[2][3]=90;

		System.out.println(values[1][0]);

		}

}
