package asslgntment3_Loops;

import java.util.Scanner;

public class MaxOf3Int {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Value 1 :");
		int value1=sc.nextInt();
		System.out.println("Enter First Value 2 :");
		int value2=sc.nextInt();
		System.out.println("Enter First Value 3 :");
		int value3=sc.nextInt();
		MaxOf3Int maxOf3Int=new MaxOf3Int();
		maxOf3Int.values(value1, value2, value3);
	}
	public void values(int value1,int value2,int value3)
	{
		if (value1>value2 && value1>value3)
			System.out.println("Maximum value is :"+value1);
		else if (value2>value1 && value2>value3)
			System.out.println("Maximum value is :"+value2);
		else
			System.out.println("Maximum value is :"+value3);
	}
	
}
