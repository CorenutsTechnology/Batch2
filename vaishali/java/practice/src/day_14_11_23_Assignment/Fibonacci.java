package day_14_11_23_Assignment;

public class Fibonacci {

	public void fibonacciSeries(int number){
		int number1=0;
		int number2=1;
		int number3=number1+number2;
		int count=1;
		while(count<number) {
			System.out.print(number3+" ");
			number1=number2;
			number2=number3;
			number3=number1+number2;
			count++;
		}
	}
	
	public void averageFibonacci(double number) {
		int number1=0;
		int number2=1;
		int number3=number1+number2;
		int count=1;
		int sum=0;
		while(count<number) {
			sum=sum+number3;
			number1=number2;
			number2=number3;
			number3=number1+number2;
			count++;
		}
		double average=sum/number;
		System.out.println("The average is "+average);
	}
	
	public static void main(String[] args) {
		Fibonacci fibonacci=new Fibonacci();
		System.out.println("The first 20 Fibonacci numbers are: ");
		fibonacci.fibonacciSeries(20);
		System.out.println();
		fibonacci.averageFibonacci(20);
	}

}
