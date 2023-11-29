package com.cnts.array;

public class Intarray {

	public static void main(String[] args) {
		Intarray array=new Intarray();
		array.value(new int []  {0,20,20,30,0,0});
		array.multidimension();
		
		
	}
		private void value(int [] IntArray) {
		int [] value=new int[5];
		//value[0]=10;
		//value[1]=20;
		//value[2]=30;
		//value[3]=40;
		//value[4]=50;
		//System.out.println(value[0]);
		//System.out.println(value[3]);
		System.out.println( IntArray[3]);
		

	}
		public void multidimension() {
			int[][] value=new int[3][];
			 value[0]=new int[3];
			value[1]=new int[2];
			 value[2]=new int [4];
			value[0][0]=20;
			value[0][1]=10;
			value[0][2]=10;
			value[1][0]=30;
			value[1][1]=50;
			value[2][0]=10;
			value[2][1]=20;
			value[2][2]=30;
			value[2][3]=40;
			System.out.println(value[2][1]);
			System.out.println(value[0][1]);
			
		}

}
