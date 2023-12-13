package programming;
import java.util.*;
public class LinearSearch {

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
		for(int i=0;i<n;i++)
		{
			if(k==array[i])
			{
				f=1;
				System.out.println(k+" is present at"+i+" th position");
			}
		}
		if(f==0)
		{
			System.out.println(k+"is not present in given array");
		}

	}

}
