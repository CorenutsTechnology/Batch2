package programming;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=scanner.nextInt(),m=0,in=0;
		int array[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
			m=array[i];
			for(int j=i+1;j<n;j++)
			{
				if(array[j]<m)
				{
					m=array[j];
					in=j;
				}
				
			}
			
		     int t=array[i];
		     array[i]=array[in];
		     array[in]=t;
		     
		    
		}
		for(int i=0;i<n;i++)
		System.out.print(array[i]+" ");
	}

}
