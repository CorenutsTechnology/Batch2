package day_14_11_23_Assignment;

public class AscendingAndDescending {

	public void ascending(int intArray[]) {
		for (int index1 = 0; index1 < intArray.length; index1++) {
			int min=index1;
			for (int index2 = index1; index2 < intArray.length; index2++) {
				if (intArray[min]>intArray[index2]) {
					min=index2;
				}
			}
			int temp=intArray[min];
			intArray[min]=intArray[index1];
			intArray[index1]=temp;
		}
		for (int index = 0; index < intArray.length; index++) {
			System.out.print(intArray[index]+" ");
		}
	}
	
	public void descending(int intArray[]) {
		for (int index1 = 0; index1 < intArray.length; index1++) {
			int max=index1;
			for (int index2 = index1; index2 < intArray.length; index2++) {
				if (intArray[max]<intArray[index2]) {
					max=index2;
				}
			}
			int temp=intArray[max];
			intArray[max]=intArray[index1];
			intArray[index1]=temp;
		}
		for (int index = 0; index < intArray.length; index++) {
			System.out.print(intArray[index]+" ");
		}
	}
	
	public static void main(String[] args) {
		int intArray[]= {5,2,9,12,10,1};
		
		AscendingAndDescending order=new AscendingAndDescending();
		
		System.out.println("ascending order");
		order.ascending(intArray);
		
		System.out.println();
		
		System.out.println("descending order");
		order.descending(intArray);
	}

}
