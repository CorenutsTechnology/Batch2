package Assignments;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort InsertionSort=new InsertionSort();
		 int intArray[]= {4,8,9,2,5};
		InsertionSort.insertionSort(intArray);
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

	}


