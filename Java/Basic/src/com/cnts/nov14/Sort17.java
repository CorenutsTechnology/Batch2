package com.cnts.nov14;

public class Sort17 
{
	public static void main(String[] args) {
		Sort17 sort17 = new Sort17();
		int[] array1 = {23,43,66,11,2,56,87,10,123,18};
		
		System.out.println("Array Before Sorting: ");
		for (int index=0; index<array1.length; index++)
		{
			System.out.print(array1[index]+" ");
		}
		System.out.println();
		System.out.println("Array after sorting in ascending order: ");
		sort17.bubbleSortAscending(array1, array1.length);
		sort17.printArray(array1, array1.length);
		
		System.out.println();
		System.out.println("Array after sorting in descending order: ");
		sort17.bubbleSortDescending(array1, array1.length);
		sort17.printArray(array1, array1.length);
	}
	
	public void bubbleSortAscending(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1]) 
                {
                    temp = arr[j];           // Swap arr[j] and arr[j+1]
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)                      // If no two elements were
                break;
        }
    }
	
	public void printArray(int arr[], int n)
	{
		int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
	}
	
	public void bubbleSortDescending(int arr[], int n)
	{
		    int i, j, temp;
		    boolean swapped;
		    for (i = 0; i < n - 1; i++)
		    {
		        swapped = false;
		        for (j = 0; j < n - i - 1; j++)         
		        {  
		            if (arr[j] < arr[j + 1])            
		            {  
		                temp = arr[j];           // Swap arr[j] and arr[j+1]
		                arr[j] = arr[j + 1];
		                arr[j + 1] = temp;
		                swapped = true;
		            }
		        }
		        if (!swapped)                         
		        {  
		            break;
		        }
		    }
		}
    }
