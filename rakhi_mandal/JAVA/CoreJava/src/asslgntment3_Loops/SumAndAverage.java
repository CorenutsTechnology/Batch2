package asslgntment3_Loops;

public class SumAndAverage {
       float sum=0;
       
	public static void main(String[] args) {
		SumAndAverage sumAndAverage=new SumAndAverage();
		sumAndAverage.sum();
	}
	public void sum() {
		for(int index=1;index<=100;index++)
		{
			sum+=index;
		}
		System.out.println("Summation : "+sum);
		System.out.println("Average : "+sum/100);
	}

}
