package com.cnts.nov14;

public class Sort18 
{
	public static void main(String[] args) {
		
		int[] array1 = {23,43,66,11,2,56,87,10,123,18};
		int size = array1.length;
		
		Sort18 sort = new Sort18();
		
		System.out.println("Sorted by using Bubble Sort");
		sort.bubbleSort(array1, size);
		sort.printSorted(array1);
		System.out.println("--------------------------------");
		
		System.out.println("Sorted by using Selection Sort");
		sort.selectionSort(array1);
		sort.printSorted(array1);
		System.out.println("--------------------------------");
		
		System.out.println("Sorted by using Insertion Sort");
		sort.insertionSort(array1);
		sort.printSorted(array1);
		System.out.println("--------------------------------");
	}
	
	public void bubbleSort(int[] arr,int size)
	{
		int i, j, temp;
        boolean swapped;
        for (i = 0; i < size - 1; i++)
        {
            swapped = false;
            for (j = 0; j < size - i - 1; j++)
            {
                if (arr[j] > arr[j + 1]) 
                {
                    temp = arr[j];           // Swap arr[j] and arr[j+1]
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)                      
                break;
        }
	}
	
	public void selectionSort(int[] arr)
	{
		int size = arr.length;
		
		for(int i=0; i<size; i++)
		{
			int min_idx=i;
			for(int j=i+1; j<size; j++)
			{
				if(arr[j]<arr[min_idx])
					min_idx=j;
				
				//swap the elemrnts after comparison
				int temp = arr[min_idx];
				arr[min_idx]=arr[i];
				arr[i]=temp;
			}
		}
		
	}
	
	public void insertionSort(int[] arr)
	{
		int j=0,temp=0;
		for(int i=1; i<arr.length; i++)
		{
			temp=arr[i];
			j=i-1;
		}
		while(j>=0 && temp<=arr[j])
		{
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=temp;
	}
	
	public void printSorted(int[] arr)
	{
		for(int index=0; index<arr.length; index++)
		{
			System.out.print(arr[index]+" ");
		}
		System.out.println();
	}
	
}
