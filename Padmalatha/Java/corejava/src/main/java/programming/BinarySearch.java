package programming;

import java.util.Scanner;

public class BinarySearch {

	public int binarySearch(int[] array,int k)
	{
		int lower=0,upper=array.length-1;
		while(lower<=upper)
		{
			int middle=(lower+(upper-1))/2;
			if(k==array[middle]){
				return middle;
			}
			else if(k<array[middle]) {
				upper=middle-1;
			}
			else
			{
				lower=middle+1;
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=scanner.nextInt(),f=0;
		int array[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int k=scanner.nextInt();
		BinarySearch binarySearch=new BinarySearch();
	
		int result=binarySearch.binarySearch(array,  k);
		
		if(result==-1)
		{
		   System.out.println("The given element is not present in array");
		}
		else
		{
			System.out.println(k +"is present at "+result+" index");
		}
	}

}
