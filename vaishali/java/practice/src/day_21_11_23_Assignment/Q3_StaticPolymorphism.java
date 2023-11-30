package day_21_11_23_Assignment;

public class Q3_StaticPolymorphism {

	public void calculate() {
		System.out.println("calculate method without arguments");
	}
	
	public void calculate(int value1,int value2) {
		int result=value1/value2;
		System.out.println("result of calculate method witho 2 arguments : "+result);
	}
	
	public int calculate(int value1) {
		System.out.print("result of calculate method with 1 argument : ");
		return value1;
	}
	
	public static void calculate(int value1,int value2,int value3) {
		System.out.println("result of calculate method with 3 arguments : "+(value1+value2+value3));
	}
	
	
}
