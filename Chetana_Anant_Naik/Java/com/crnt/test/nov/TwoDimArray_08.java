package com.crnt.test.nov;

import java.util.Arrays;


public class TwoDimArray_08 {
public static void main(String[] args) {
	TwoDimArray_08 twoDimArray_08=new TwoDimArray_08();
	twoDimArray_08.intArray();
}

private  void intArray() {
	// TODO Auto-generated method stub
int[][] intArray =new int[3][];
	
	intArray[0]=new int[4];
	intArray[1]=new int[3];
	intArray[2]=new int[4];
	
	intArray[0][0]=1;
	intArray[0][1]=1;
	intArray[0][2]=1;
	intArray[0][3]=1;
	
	
	intArray[1][0]=2;
	intArray[1][1]=2;
	intArray[1][2]=2;
	
	
	intArray[2][0]=3;
	intArray[2][1]=3;
	intArray[2][2]=3;
	intArray[2][3]=3;
	
	

	for (int i = 0; i < intArray.length; i++) {
		for (int j = 0; j< intArray.length; j++) {
			
			
				System.out.print(intArray[i][j]+" ");
			}	
	
		System.out.println();
	}
}
}
