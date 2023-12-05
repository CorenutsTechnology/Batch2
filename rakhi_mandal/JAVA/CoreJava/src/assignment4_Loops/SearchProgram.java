package assignment4_Loops;

import java.util.Scanner;

public class SearchProgram {

	public static void main(String[] args) {
		int array[]= {5,6,3,2,7,19,9};
		int key=19;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the type of searching technique you want to try :1.Linear Search 2.Binary Search ");
	    int response=sc.nextInt();
	    switch(response)
	    {
	    case 1:{
	    	linear(array,key);
			System.out.println(key+ " found at index position "+linear(array,key));
			break;

	    }
	    case 2:{
	    	binary(array,key);
			System.out.println(key+ " found at index position "+binary(array,key));
			break;
	    }
	    }
		
	}
	public static int linear(int array[],int key)
	{
		for(int index=0;index<array.length;index++)
		{
			if(array[index]==key)
			{
				return index;
			}
		}
		return -1;
	}
	
	public static int binary(int array[],int key)
	{
        int left=0;
        int right=array.length-1;
        while(left<=right)
		{   int mid=(left+right-1)/2;
		
		{	if(array[mid]==key)
			{
				return mid;
			}
		else if(array[mid]<key)
		{
			left=mid+1;
		}
		else
			right=mid-1;
		}
		}
		return -1;
	}

}
