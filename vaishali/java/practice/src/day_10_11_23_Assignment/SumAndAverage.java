package day_10_11_23_Assignment;

public class SumAndAverage {

	public int sum(double number) {
		int sum=0;
		for(int index=1;index<=number;index++) {
			sum=sum+index;
		}
		return sum;
	}
	
	public double average(double number) {
		return sum(number)/number;
	}
	
	public static void main(String[] args) {
		SumAndAverage sumAndAverage=new SumAndAverage();
		System.out.println("The sum is "+sumAndAverage.sum(100));
		System.out.println("The average is "+sumAndAverage.average(100));
	}

}
