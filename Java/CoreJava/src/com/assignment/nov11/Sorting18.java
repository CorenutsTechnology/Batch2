package com.assignment.nov11;

public class Sorting18 
{
	public void bubbleSort(int[] array)
	{
		System.out.println("bubble sort started");
		for(int index1 = 0;index1<array.length;index1++)
		{
			for(int index2 = 0;index2<array.length;index2++)
			{
				if(array[index1] < array[index2])
				{
					int temp =array[index1] ;
					array[index1] =array[index2];
					array[index2]=temp; 
				}
			}
		}
		
		System.out.println("bubble sort ended");
		System.out.println("after bubble sort array is:");
		for(int value:array)
		{
			System.out.println(value);
		}
		
	}
	public void selectionSort(int[] array)
	{
		System.out.println("selection sort started");
		for (int index = 0; index < array.length - 1; index++)  
        {  
            int min = index;  
            for (int index2 = index + 1; index2 < array.length; index2++)
            {  
                if (array[index2] < array[min])
                {  
                    min = index2;//searching for lowest index  
                }      
            }
            int temp=array[min];
            array[min]=array[index];
            array[index]=temp;
        }
		System.out.println("selection sort ended");
		System.out.println("after selection sort array is:");
		for(int value:array)
		{
			System.out.println(value);
		}
	}
	public void insertionSort(int[] array)
	{
		System.out.println("insertion sort started");
		int index1, index2, temp;  
	    for (index1 = 1; index1 < array.length; index1++) 
	    {  
	        temp = array[index1];  
	        index2 = index1 - 1;  
	  
	        /* Move the elements greater than temp 
			to one position
				ahead from their current position*/  
	        while(index2>=0 && temp <= array[index2])  
	        {    
	            array[index2+1] = array[index2];     
	            index2 = index2-1;    
	        }    
	        array[index2+1] = temp;    
	    }  
		System.out.println("insertion sort ended");
		System.out.println("after insertion sort array is:");
		for(int value:array)
		{
			System.out.println(value);
		}
	}
	public static void main(String[] args) 
	{
		Sorting18 sorting18 = new Sorting18();
		sorting18.bubbleSort(new int[] {23,45,12,34,16});
		sorting18.selectionSort(new int[] {34,23,16,78,45});
		sorting18.insertionSort(new int[] {67,56,98,76,30});
	}
}
