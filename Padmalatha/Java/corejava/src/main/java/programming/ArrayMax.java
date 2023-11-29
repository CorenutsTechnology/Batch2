package programming;
import java.util.*;
public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=scanner.nextInt();
		int sum=0;
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
			sum+=array[i];
		}
		int max=array[0];
		for(int i=1;i<n;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.println("Max:"+max);
		System.out.println();
		int min=array[0];
		for(int i=1;i<n;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println("Min:"+min);
		System.out.println();
		System.out.println("Average:"+sum/n);

	}

}
