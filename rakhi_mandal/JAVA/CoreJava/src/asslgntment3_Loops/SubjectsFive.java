package asslgntment3_Loops;

import java.util.Scanner;

public class SubjectsFive {
      
	public static void main(String[] args) {
		SubjectsFive subjectsFive= new SubjectsFive();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks in subject 1 : ");
		float value1=sc.nextFloat();
		System.out.println("Enter the marks in subject 2 : ");
		float value2=sc.nextFloat();
		System.out.println("Enter the marks in subject 3 : ");
		float value3=sc.nextFloat();
		System.out.println("Enter the marks in subject 4 : ");
		float value4=sc.nextFloat();
		System.out.println("Enter the marks in subject 5 : ");
		float value5=sc.nextFloat();
		float[] marks= {value1,value2,value3,value4,value5};
		
		System.out.println("What you want to check: 1.Maximum Mark(max) 2.Minimum Mark(min) 3.Average Mark(avg)");
		sc.nextLine();
		String check=sc.nextLine();
		switch(check)
		{
		case "max":
			{   System.out.println("Maximum mark is : "+subjectsFive.maxValue(marks));
			    break;
				
			}
		case "min":
			{   System.out.println("Minimun mark is : "+subjectsFive.minValue(marks));
		    	
				break;
			}
		case "avg":
			{   System.out.println("Average mark is : "+subjectsFive.avgValue(marks));
		    	
				break;
				
			}
		}
	}
	public float maxValue(float[] marks)
	{
		float max=marks[0];
		for(int index=0;index<marks.length;index++)
		{
			if(marks[index]>max)
			{
				max=marks[index];
			}
		}
		return max;
	}
	public float minValue(float[] marks)
	{
		float min=marks[0];
		for(int index=0;index<marks.length;index++)
		{
			if(min>marks[index])
			{
				min=marks[index];
			}
		}
		return min;
	}
	public float avgValue(float[] marks)
	{
		
		float sum=0;
		
		for(int index=0;index<marks.length;index++)
		{
			sum+=marks[index];
		}
		return sum/5;
	}

}
