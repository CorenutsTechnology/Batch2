package com.crnt.test.nov;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ConditionalOperator_14 {
public static void main(String[] args) {
	ConditionalOperator_14 conditionalOperator_14=new ConditionalOperator_14();
//	conditionalOperator_14.fibonacci();
//	conditionalOperator_14.sortTheInteger();
//	conditionalOperator_14.palindromNumber();
//	conditionalOperator_14.switchCase();
	conditionalOperator_14.randomValue();
}

private void randomValue() {
	Random random=new Random();
	int intArrray[]=new int[25];
	for(int index=0;index<25;index++) {
		int value=random.nextInt(1000);
		intArrray[index]=value;
	
	}
    System.out.println(Arrays.toString(intArrray));
	for(int index=0;index<intArrray.length;index++) {
		if(intArrray[1]==intArrray[index]) {
			System.out.println(intArrray[index]+" is Equal to "+intArrray[1]);
		}else if(intArrray[1]>intArrray[index]) {
			System.out.println(intArrray[index]+" is less then "+intArrray[1]);
		}else if(intArrray[1]<intArrray[index]) {
			System.out.println(intArrray[index]+" is greater then "+intArrray[1]);
		}
	}
	
}

private void switchCase() {
	Scanner sc=new Scanner(System.in);
	
	for(int index=0;index<26;index++) {
		System.out.println("enter the charecter");
 char charValue=sc.next().charAt(0);
//		char charValue=(char)index;
		switch(charValue) {
		case 'A':System.out.println("this is A block");
		break;
		case 'B':System.out.println("this is B block");
		break;
		case 'C':System.out.println("this is C block");
		break;
		case 'D':System.out.println("this is D block");
		break;
		default:System.out.println("this is DEFalut block");
		break;
		}
	}
	
}

private void palindromNumber() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int value=sc.nextInt();
	int copy=value;
	 int reverse=0;
	while(value!=0) {
		int rem=value%10;
		reverse=reverse*10+rem;
		value=value/10;
	}
	
	if(copy==reverse) {
		System.out.println(copy+" is palindrom");
	}else {
		System.out.println(copy+" is not palindrom");
	}
}

private void sortTheInteger() {
	int intArray[]= {2,1,6,3,8,5};
	for(int index=0;index<intArray.length;index++) {
		for(int index1=0;index1<intArray.length-1-index;index1++) {
			if(intArray[index1+1]<intArray[index1]) {
				int temp=intArray[index1];
				intArray[index1]=intArray[index1+1];
				intArray[index1+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(intArray));
	for(int index=0;index<intArray.length;index++) {
		for(int index1=0;index1<intArray.length-1-index;index1++) {
			if(intArray[index1+1]>intArray[index1]) {
				int temp=intArray[index1];
				intArray[index1]=intArray[index1+1];
				intArray[index1+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(intArray));
}

public  void fibonacci() {
int f1=0;
int f2=1;
System.out.print(f1+" "+f2+" ");
int f3=0;
int n=20;
double sumOfFibonacci=1;
	for(int index=1;index<20;index++) {
		f3=f2+f1;
		System.out.print(f3+" ");
		sumOfFibonacci+=f3;
		f1=f2;
		f2=f3;
	}
	System.out.println();
	double avgOfFibonacci=sumOfFibonacci/n;
	System.out.println("average value is: "+avgOfFibonacci);
}
}
