package Assignments;

public class SumAndAverage {

	public static void main(String[] args) {
		int sum=0;
		double avg=0;
		for(int index=1;index<=100;index++) {
			sum=sum+index;
			avg=sum/100;
		}
			System.out.println( "Sum"+sum);
			System.out.println(" Average"+avg);
			
		}
	}


