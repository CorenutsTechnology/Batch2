package assignment4_Loops;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Sorting sorting=new Sorting();
		Scanner sc =new Scanner(System.in);
		int[] array= {66,41,59,66,44,5};
		System.out.println("Array before sorting :");
	    for(int index=0;index<array.length;index++)
	    {
	    	System.out.print(array[index]+ " ");
	    }
	    System.out.println();
	    System.out.println("Enter the type of sorting technique you want to try :1.Bubble Sort 2.Selection Sort 3.Insertion Sort");
	    int response=sc.nextInt();
	    switch(response)
	    {
	    case 1:{
	    	sorting.bubbleSort(array);
	    	System.out.println("Array after sorting using Bubble Sort :");
		    for(int index=0;index<array.length;index++)
		    {
		    	System.out.print(array[index]+ " ");
		    } break;
	    }
	    case 2:{
	    	sorting.selectionSort(array);
	    	System.out.println("Array after sorting using Selection Sort :");
		    for(int index=0;index<array.length;index++)
		    {
		    	System.out.print(array[index]+ " ");
		    }break;
	    }
	    case 3:{
	    	sorting.insertionSort(array);
	    	System.out.println("Array after sorting using Insertion Sort:");
		    for(int index=0;index<array.length;index++)
		    {
		    	System.out.print(array[index]+ " ");
		    }
	    }
	    }

	}
	public static void bubbleSort(int array[])
	{   int temporary=0;
		for(int index=0;index<array.length;index++)
		{
			for(int index1=1;index1<array.length-index;index1++)
			{
				if(array[index1-1]>array[index1])
				{
					temporary=array[index1-1];
					array[index1-1]=array[index1];
					array[index1]=temporary;
				}
			}
		}
	}
	public static void selectionSort(int array[])
	{  
		for(int index=0;index<array.length;index++)
		{    int minIndex=index;
			for(int index1=index+1;index1<array.length;index1++)
			{    
				if(array[index1]<array[minIndex])
				{
					minIndex=index1;
					
				}
			}

			int temporary=array[index];
			array[index]=array[minIndex];
			array[minIndex]=temporary;	
		}
	}
	public static void insertionSort(int array[])
	{  
		for(int index=1;index<array.length;index++)
		{    int previousIndex=index-1;
		     int keyValue=array[index];
		while(previousIndex>=0 && array[previousIndex]>keyValue)
		{
			 array[previousIndex + 1] = array[previousIndex];
			 previousIndex = previousIndex - 1;
		}
		array[previousIndex + 1] = keyValue;

		}
	}

}
