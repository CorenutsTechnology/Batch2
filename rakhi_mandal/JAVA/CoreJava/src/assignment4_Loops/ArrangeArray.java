package assignment4_Loops;

import java.util.Iterator;
import java.util.Scanner;

public class ArrangeArray {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number of Array elements : ");
		int[] array= {6,4,5,66,44,5};
		System.out.println("Array before sorting :");
	    for(int index=0;index<array.length;index++)
	    {
	    	System.out.print(array[index]+ " ");
	    }
	    System.out.println();
	    sort(array);
	    System.out.println("Array after sorting ascending order :");

	    for(int index=0;index<array.length;index++)
	    {
	    	System.out.print(array[index]+" ");
	    }
	    System.out.println();
	    System.out.println("Array after sorting descending order :");

	    for(int index=array.length-1;index>0;index--)
	    {
	    	System.out.print(array[index]+" ");
	    }
		
//		System.out.println("Enter array elements");
	
		
	}
	public static void sort(int array[])
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
	

}
