package com.crnt.nov0823;

public class IntArray {
	public static void main(String[] args) {
		IntArray.test();
		IntArray.mulDimArray();
	}

	private static void mulDimArray() {
		int [][] value1 = new int [3][6];
		//value1[0] = new int[5];
		//value1[1]= new int[3];
		//value1[2]= new int[5];
		value1[0][0]=2;
		value1[0][1]=3;
		value1[0][2]=20;
		
		value1[1][0]=12;
		value1[1][1]=27;
		
		value1[2][0]=92;
		value1[2][1]=28;
		value1[2][2]=52;
		value1[2][3]=22;
		value1[2][4]=62;
		System.out.println("multi dimensional array : ");
		System.out.println(value1[2][1]);
		System.out.println(value1.length);
		System.out.println(value1[0].length);
		System.out.println(value1[1].length);
		System.out.println(value1[2].length);
		System.out.println("anonymous array length : "+new int[] {3,4,5,6,5}.length);
		System.out.println("anonymous two dimensional array length : "+new int[5][6].length);
		System.out.println("anonymous array index value : "+new int[] {3,4,5}[2]);
		
		
	}

	private static void test() {
		int [] value =null;
				value=new int [5];
				System.out.println(value);
				
		value[0]=20;
		value[1]=10;
		value[2]=5;
		value[3]=2;
		value[4]=1;
		System.out.println(value.length);
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		System.out.println(value[3]);
		System.out.println(new int[] {2,3,4,5,6});
		
		
	}
	

}
