package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		MultiDimensionalArray array = new MultiDimensionalArray();
		array.values(new int[] {0,0,0,20,0,0});

	}

	public void values(int[] index) {
		int[][] intArray = new int[3][];

		intArray[0] = new int[2];
		intArray[1] = new int[3];
		intArray[2] = new int[2];
		
		intArray[0][0]=10;
		intArray[0][1]=20;
		
		intArray[1][0]=30;
		intArray[1][1]=40;
		intArray[1][2]=50;
		
		
		intArray[2][0]=60;
		intArray[2][1]=70;
		
		System.out.println(intArray[2][0]);
		System.out.println(intArray[0][1]);
		System.out.println(intArray.length);
		
		
		
	}

}
