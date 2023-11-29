package com.arrays;

public class IntArray {

	public static void main(String[] args) {
//		int[] intArray= {2,02,3,7,9};
       IntArray array=new IntArray();
//       array.values(new int[] {0,9,4,6,9});
		array.values();
	}
	private void values()
	{
		int[] array=new int[5];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		System.out.println(array[0]);
		System.out.println(array[4]);
	}

}
