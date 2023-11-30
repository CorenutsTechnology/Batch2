package day_21_11_23_Assignment;

public class Q3_StaticPolymorphismTest {

	public static void main(String[] args) {
		Q3_StaticPolymorphism test=new Q3_StaticPolymorphism();
		test.calculate();
		System.out.println(test.calculate(10));
		test.calculate(12,3);
		Q3_StaticPolymorphism.calculate(14, 5, 2);
	}

}
