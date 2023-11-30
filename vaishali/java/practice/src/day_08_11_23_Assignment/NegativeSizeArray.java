package day_08_11_23_Assignment;

public class NegativeSizeArray {
	
	public static void main(String[] args) {
		NegativeSizeArray negativeSizeArray=new NegativeSizeArray();
		negativeSizeArray.neagtiveSize();
	}
	public void neagtiveSize() {
		int[] array=new int[-3];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		System.out.println(array[2]);//NegativeArraySizeException
	}
}
