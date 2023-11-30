package programming;
import java.util.*;
public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first=0,second=1,third,count=0,sum=0;
		double n=20;
		System.out.println(1);
		for(int i=0;i<n-1;i++)
		{
			third=first+second;
			sum+=third;
			System.out.println(third);
			first=second;
			second=third;
		}
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+(sum/n));
		

	}

}
