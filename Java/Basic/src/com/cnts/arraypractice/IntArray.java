package com.cnts.arraypractice;

public class IntArray 
{
	public static void main(String[] args) {
		
		IntArray array = new IntArray();
//		array.singleDimensionArray();
		array.multiDimensionArray();
	}
	
//	public void singleDimensionArray()
//	{
//		int[] intArray = new int[5];
//		intArray[0]=17;
//		intArray[1]=12;
//		intArray[2]=15;
//		intArray[3]=16;
//		intArray[4]=12;
//		
//		System.out.println(intArray[0]);
//		System.out.println(intArray[3]);
//		System.out.println(intArray[2]);
//	}
	
	public void multiDimensionArray()
	{
		int[][] multiArray = new int[4][];
		
		
		
		multiArray[0][0]=37;
		multiArray[0][1]=47;
		multiArray[0][2]=57;
		
		multiArray[1][0]=67;
		multiArray[1][1]=77;
		multiArray[1][2]=87;
		
		
		multiArray[2][0]=17;
		multiArray[2][1]=27;
		multiArray[2][2]=56;
		
		
		System.out.println(multiArray[0]);
		System.out.println(multiArray[1].length);
		System.out.println(multiArray[2].length);
		System.out.println(multiArray[3].length);
		System.out.println(multiArray.length);
		
		
	}
}
