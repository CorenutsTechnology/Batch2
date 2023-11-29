package programming;

import java.util.Scanner;

public class InsertionSort {

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
		
		for(int j=1;j<n;j++)
		{
			int k=array[j];
			int i=j-1;
			while(i>-1&&array[i]>k)
			{
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=k;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
