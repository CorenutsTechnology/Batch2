package Assignments;

public class SelectionSort {

	public static void main(String[] args) {
		int value[]= {5,8,9,2,6,4};
		SelectionSort SelectionSort=new SelectionSort();
		SelectionSort.selectionSort(value);
	}
	public void selectionSort(int value[]) {
		for(int index=0;index<value.length;index++) {
			int min=index;
			for(int index1=index+1;index1<value.length;index1++) {
				
				if(value[min]>value[index1]) {
					min=index1;
					
				}}
					int temp=value[min];
					value[min]=value[index];
					value[index]=temp;
			
				}
		
		for(int index=0;index<value.length;index++) {
			System.out.println(value[index]);
		}
	}

}
