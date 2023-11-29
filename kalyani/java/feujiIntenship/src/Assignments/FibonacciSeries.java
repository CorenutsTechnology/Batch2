package Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=18;
		int result=0;
		double avg=0;
		int value=0;
		int value1=1;
		int sum=value+value1;
		System.out.println(value+"\t"+ value1);
		while(n!=0) {
			System.out.println(sum);
			value=value1;
			value1=sum;
			sum=value+value1;
			result=result+sum;
			
			avg=result/20;
			
			n--;
			
			
		}
		System.out.println(avg);
		
	}

}
