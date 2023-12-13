package com.org.flowcontrol10;

public class SumAndAverage {
public void calculateSumAndAverage(int start,int end)
{
int sum=0;
int countValue=0;
for(int startValue=start;startValue<=end;startValue++)
{
	sum+=startValue;
	countValue++;
}
double average=sum/countValue;
System.out.println("sum is"+sum);
System.out.println("average is"+average);
}


}
