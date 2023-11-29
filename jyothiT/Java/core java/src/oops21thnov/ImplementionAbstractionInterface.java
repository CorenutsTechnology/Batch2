package oops21thnov;

import java.util.Scanner;

public class ImplementionAbstractionInterface implements AbstractionInterface{


	public void calculator() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value for addition");
		int value1=sc.nextInt();
		System.out.println("enter the second value for addition");
        int value2=sc.nextInt();
        int result=value1+value2;
        System.out.println("the result of addition is= "+result);
		
	}

	
}
