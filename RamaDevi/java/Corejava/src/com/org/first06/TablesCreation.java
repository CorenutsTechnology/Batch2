package com.org.first06;

import java.util.Scanner;
//this is the table Creation class
public class TablesCreation {
	
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter how many tables do you want");
		  int uptoNumber=sc.nextInt(); 
		  System.out.println("starting with");
		  int starting=sc.nextInt();
		  System.out.println("Enter upto how many values"); 
		  int lastnum=sc.nextInt(); 
		  System.out.println("Enter table start with");
		  int valstart=sc.nextInt();
//		checking the condition if the given numbers are within Range or not 
		if(starting<=4000&&uptoNumber<=5000)
		{
//			how many tables we want 
		for(int start=starting;start<=uptoNumber;start++)
		{
			System.out.println("----table----"+start);
//			how many times we want iterate
			for(int tablestart=valstart;tablestart<=lastnum;tablestart++)
			{
				System.out.println(start+"*"+tablestart+"="+start*tablestart);
			
			}
			
		}
		}
		else
		{
			System.out.println("Invalid Number");
		}
}
}