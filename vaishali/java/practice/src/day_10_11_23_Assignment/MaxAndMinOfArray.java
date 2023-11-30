package day_10_11_23_Assignment;

public class MaxAndMinOfArray {

	public void maxAndMin() {
		int[] intArray= {10,21,49,9,6};
		int max=Integer.MIN_VALUE;
		int min=intArray[0];
		for(int index=0;index<intArray.length;index++) {
			if(max<intArray[index]) {
				max=intArray[index];
			}
			else if(min>intArray[index]) {
				min=intArray[index];
			}
		}
		System.out.println("maximum value - "+max);
		System.out.println("minimum value - "+min);
	}
	
	public static void main(String[] args) {
		MaxAndMinOfArray maxAndMinOfArray=new MaxAndMinOfArray();
		maxAndMinOfArray.maxAndMin();
	}

}
