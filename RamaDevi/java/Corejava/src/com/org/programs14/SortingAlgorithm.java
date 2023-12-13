package com.org.programs14;

public class SortingAlgorithm {
public void bubbleSort(int[]array)
{
	for(int i=0;i<array.length-1;i++)
	{
		for(int j=i+1;j<array.length-1-i;j++)
		{
			if(array[i]>array[j])
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
}


 public void selectionSort(int[]array) {
	 for(int i=0;i<array.length;i++)
	 {
		 int index=i;
		 for(int j=index+1;j<array.length;j++)
		 {
			 if(array[j]<array[index]) index=j;
		 }
		 if(i!=index)
		 {
			 int temp=array[i];
			 array[i]=array[index];
			 array[index]=temp;
		 }
	 }
}
 
 public void insertionSort(int[] array)
 {
	 for(int i=1;i<array.length;i++)
	 {
		 int key=array[i];
		 int j=i-1;
		 while(j>-1&&array[j]>key)
		 {
			 array[j+1]=array[j];
			 j--;
		 }
		 array[j+1]=key;
	 }
 }
}