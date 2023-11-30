package day_08_11_23;

public class MultiDimensionArray {

	public static void main(String[] args) {
		MultiDimensionArray multiDimensionArray=new MultiDimensionArray();
		multiDimensionArray.array();
		multiDimensionArray.array1();
	}
	
	public void array() {
		int[][] intArray=new int[3][];
		
		intArray[0]=new int[2];
		intArray[1]=new int[4];
		intArray[2]=new int[3];
		
		intArray[0][0]=10;
		intArray[0][1]=20;
		
		intArray[1][0]=30;
		intArray[1][1]=40;
		intArray[1][2]=50;
		intArray[1][3]=60;
		
		intArray[2][0]=70;
		intArray[2][1]=80;
		intArray[2][2]=90;
		
		
		System.out.println(intArray[0][0]);
		System.out.println(intArray[2][1]);
	}
	
	public void array1() {
		int[][] intArray=new int[3][3];
		
		intArray[0]=new int[4];
		intArray[1]=new int[3];
		intArray[2]=new int[2];
		
		System.out.println(intArray[0].length);
		System.out.println(intArray[1].length);
		System.out.println(intArray[2].length);
	}
	
	public void array2() {
		
	}
}
