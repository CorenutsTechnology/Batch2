package day_14_11_23_Assignment;

public class SortArray {

	public void bubbleSort(int intArray[]) {
		for (int row = 0; row < intArray.length; row++) {
			for (int column = 1; column < intArray.length-row; column++) {
				if(intArray[column-1]>intArray[column]) {
					int temp=intArray[column-1];
					intArray[column-1]=intArray[column];
					intArray[column]=temp;
				}
			}
		}
		for (int index=0;index<intArray.length;index++) {
			System.out.print(intArray[index]+" ");
		}
	}
	
	public void selectionSort(int intArray[]) {
		for (int index1 = 0; index1 < intArray.length; index1++) {
			int min=index1;
			for (int index2 = index1; index2 < intArray.length; index2++) {
				if(intArray[min]>intArray[index2]) {
					min=index2;
				}
			}
			int temp=intArray[min];
			intArray[min]=intArray[index1];
			intArray[index1]=temp;
		}
		
		for (int index=0;index<intArray.length;index++) {
			System.out.print(intArray[index]+" ");
		}
		
	}
	
	public void insertionSort(int intArray[]) {
		for (int index1 = 1; index1 < intArray.length; index1++) {
			int temp=intArray[index1];
			int index2=index1-1;
			while (index2>=0 && temp<=intArray[index2]) {
				intArray[index2+1]=intArray[index2];
				index2=index2-1;
			}
			intArray[index2+1]=temp;
		}

		for (int index=0;index<intArray.length;index++) {
			System.out.print(intArray[index]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		int intArray[]= {9,3,4,8,7,1};
		
		System.out.println("before sorting ");
		for (int index=0;index<intArray.length;index++) {
			System.out.print(intArray[index]+" ");
		}
		System.out.println();
		
		SortArray sort=new SortArray();
		
		System.out.println("after bubble sorting ");
		sort.bubbleSort(intArray);
		
		System.out.println();
		
		System.out.println("after selection sorting");
		sort.selectionSort(intArray);
		
		System.out.println();
		
		System.out.println("after insertion sorting");
		sort.insertionSort(intArray);
	}

}
