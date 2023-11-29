package com.crnt.test.nov;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CondtionalOperator_10 {
public static void main(String[] args) {
	CondtionalOperator_10 condtionalOperator_10 =new CondtionalOperator_10();
	condtionalOperator_10.nonprimeNumber();
//	condtionalOperator_10.timeTable();
//	condtionalOperator_10.stringArray();
//	condtionalOperator_10.pattern();
//	condtionalOperator_10.checkBoard();
//	condtionalOperator_10.pattern12345();
//	condtionalOperator_10.sumAvg();
//	condtionalOperator_10.electicity();
//	condtionalOperator_10.marks5();
//	condtionalOperator_10.intigerArray();
//	condtionalOperator_10.intigerNumber();
//	condtionalOperator_10.breakKey();
//	condtionalOperator_10.multiplicationOf3();
//	condtionalOperator_10.findGrade();
//	condtionalOperator_10.switchCase();
	
	
}

private void switchCase() {
	char value1='A';
		switch (value1) {
		case 'A':
			System.out.println("DISTINCTION");
			break;
		case  'B':
			System.out.println("SECEND CLASS");
			break;
		case  'C':
			System.out.println("FAIL");
			break;
		
		default :
			System.out.println("unwanteded value");
			break;
		}
		
 
	
}

private void findGrade() {
	// TODO Auto-generated method stub
	int totalMarks=56;
	if(totalMarks<32) {
		System.out.println("FAIL");
	} else if(totalMarks>32 && totalMarks<60){
		System.out.println("SECEND CLASS");
	} else if(totalMarks>60 && totalMarks<85){
		System.out.println("FIRST CLASS");
	}
	else {
		System.out.println("DISTINCTION");
	}	
}

private void multiplicationOf3() {
//	for (int index =1; index <50; index++) {
//		if(index%3==0) {
//			if(index%2!=0) {
//				System.out.println(index);
//			
//			}
//		}
//	}
	
	//whileLoop
//	int index=1;
//	while(index<50) {
//		if(index%3==0) {
//			if(index%2!=0) {
//				System.out.println(index);
//			
//			}
//		}
//		index++;
//	}
	
	//doWhileLoop
	int index=1;
	do {
		if(index%3==0) {
			if(index%2!=0) {
				System.out.println(index);
			
			}
		}
		index++;
	}while(index<50);
		
	
}

private void breakKey() {
	// TODO Auto-generated method stub
	for (int index = 1; index <100; index++) {
		System.out.println(index);
    	if(index==47) {
    		break;
    	}
	}
}

private void intigerNumber() {
	// TODO Auto-generated method stub
	int value1=40;
	int value2=30;
	int value3=100;
	
	int big=value1;
	if(big<value2) {
		big=value2;
	}
	if(big<value3) {
		big=value3;
	}
	System.out.println("max number is"+big);
	
}

private void intigerArray() {
	int marksArray[]= {1,2,3,5,6,3,4,8};
	Arrays.sort(marksArray);
	System.out.println("max marks is " +marksArray[marksArray.length-1]);
    System.out.println("min marks is " +marksArray[0]);
}

private void marks5() {
	int marksArray[]= {99,87,97,54,43,32};
	Arrays.sort(marksArray);
	System.out.println("max marks is " +marksArray[marksArray.length-1]);
    System.out.println("min marks is " +marksArray[0]);
    int SumOfMarks=0;
    for (int i = 0; i < marksArray.length; i++) {
    	SumOfMarks+=marksArray[i];
	}
    int avgMarks=SumOfMarks/marksArray.length-1;
    System.out.println("Avg marks is "+avgMarks);
}

private void electicity() {
	// TODO Auto-generated method stub
	int unitCharge=101;
	if(unitCharge<50) {
		System.out.println(" Rs 250- Minimum usage");
	} else if(unitCharge>50 && unitCharge<100){
		System.out.println(" Rs 5- Moderate usage");
	}
	else {
		System.out.println(" Rs 8- High usage");
	}
}

private void sumAvg() {
	int sumOfNum=0;
	int num=10;
	for(int index=1;index<=num;index++) {
		sumOfNum+=index;
	}
	System.out.println("The sum is "+sumOfNum);
	double avgOfNum=sumOfNum/num;
	System.out.println("The avg is "+avgOfNum);
}

private void pattern12345() {

//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 

	for(int index=1;index<=5;index++) {
		for(int index1=1;index1<=index;index1++) {
			 System.out.print(index+" ");
		}
		System.out.println();
	}
}


private void checkBoard() {
	// TODO Auto-generated method stub
//	# # # # # # # # # # 
//	# # # # # # # # # # 
//	# # # # # # # # # # 
//	# # # # # # # # # # 
//	# # # # # # # # # # 
//	# # # # # # # # # # 
//	# # # # # # # # # # 

	for(int index=0;index<10;index++) {
		for(int index1=0;index1<10;index1++) {
			
			 System.out.print("# ");
		}
		System.out.println();
	}
}

private void pattern() {
	// TODO Auto-generated method stub
//	* * * * * * * * * * 
//	* * * * * * * * * 
//	* * * * * * * * 
//	* * * * * * * 
//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 

	for(int index=0;index<10;index++) {
		for(int index1=0;index1<10;index1++) {
			if(index<=index1)
			 System.out.print("* ");
		}
		System.out.println();
	}
}

private void stringArray() {
	// TODO Auto-generated method stub
//	c 
//	c o 
//	c o r 
//	c o r e 
//	c o r e n 
//	c o r e n u 
//	c o r e n u t 
//	c o r e n u t s 

	String stringName="corenuts";
	for(int index=0;index<stringName.length();index++) {
		for(int index1=0;index1<=index;index1++) {
			char charName=stringName.charAt(index1);
			 System.out.print(charName+" ");
		}
		System.out.println();
	}
}

private void timeTable() {
	// TODO Auto-generated method stub
//	1 |1 2 3 4 5 6 7 8 9 
//	2 |2 4 6 8 10 12 14 16 18 
//	3 |3 6 9 12 15 18 21 24 27 
//	4 |4 8 12 16 20 24 28 32 36 
//	5 |5 10 15 20 25 30 35 40 45 
//	6 |6 12 18 24 30 36 42 48 54 
//	7 |7 14 21 28 35 42 49 56 63 
//	8 |8 16 24 32 40 48 56 64 72 
//	9 |9 18 27 36 45 54 63 72 81 

	System.out.print("* |");
	for(int index1=1;index1<10;index1++) {
		
		 System.out.print(index1+" ");
	}
	System.out.println();
	for(int index=1;index<10;index++) {
		System.out.print(index+" |");
		for(int index1=1;index1<10;index1++) {
			
			 System.out.print(index*index1+" ");
		}
		System.out.println();
	}
}

private void nonprimeNumber() {
//	 TODO Auto-generated method stub
	for(int index=1;index<100;index++) {
		boolean flag=true;
		for(int index1=1;index1<index;index1++) {
			if(index1%index==0) {
				flag=false;
				break;
			}
		}
		if(flag==false) {
			System.out.println(index+" is nonprime");
		} 
		
	}
	
//	int index=1;
//	while(index<100) {
//		boolean flag=true;
//		int index1=2;
//		while(index1<index)
//		 {
//			if(index1%index==0) {
//				flag=false;
//				break;
//			}
//			
//			index1++;
//		}
//		
//		if(flag==false) {
//			System.out.println(index+" is nonprime");
//		} 
//	
//	index++;
//}
//	System.out.println("sdfgoeertyuiolkjhg");
}
}