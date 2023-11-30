package programming;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt(),t;
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i]<array[j])
				{
					t=array[i];
					array[i]=array[j];
					array[j]=t;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}

	}

}
