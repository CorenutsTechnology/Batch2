package programming;

import java.util.*;
public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range");
		int lowerBound=scanner.nextInt();
		int upperBound=scanner.nextInt();
		int sum=0;
		double average=0;
		double n=0;
		for(int i=lowerBound;i<=upperBound;i++)
		{
			sum+=i;
			n++;
		}
		System.out.println("Sum :"+sum);
		average=sum/n;
		System.out.println("Average :"+average);
	}

}
