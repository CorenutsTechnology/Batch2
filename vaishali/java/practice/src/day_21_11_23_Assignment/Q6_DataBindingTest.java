package day_21_11_23_Assignment;

public class Q6_DataBindingTest {
	
	public static void main(String[] args) {
//		Q6_Maths maths=new Q6_Maths();
		
		Q6_Calculation calculate=new Q6_Calculation();
		calculate.calculate(21, 2);
		
		calculate.calculate();
		System.out.println(calculate.calculate(11));
		calculate.calculate(34, 5);
	}
	
}
