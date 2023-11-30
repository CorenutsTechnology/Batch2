package day_10_11_23_Assignment;

import java.util.Scanner;

public class Five_Subjects {

	public void maxAndMin(double subjects[]) {
		double min=0;
		double max=subjects[0];
		for(int index=0;index<subjects.length;index++) {
			if(max<=subjects[index]) {
				max=subjects[index];
			}
			else {
				min=subjects[index];
			}
		}
		System.out.println("maximum marks : "+max);
		System.out.println("minimum marks : "+min);
	}
	
	public void average(double subjects[]) {
		double sum=0;
		for(int index=0;index<subjects.length;index++) {
			sum=sum+subjects[index];
		}
		double average=sum/subjects.length;
		System.out.println("Average marks : "+average);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter subject1 marks : ");
		double subject1=sc.nextDouble();
		System.out.println("enter subject2 marks : ");
		double subject2=sc.nextDouble();
		System.out.println("enter subject3 marks : ");
		double subject3=sc.nextDouble();
		System.out.println("enter subject4 marks : ");
		double subject4=sc.nextDouble();
		System.out.println("enter subject5 marks : ");
		double subject5=sc.nextDouble();
		double subjects[]= {subject1,subject2,subject3,subject4,subject5};
		
		Five_Subjects five_Subjects=new Five_Subjects();
		five_Subjects.maxAndMin(subjects);
		five_Subjects.average(subjects);
	}

}
