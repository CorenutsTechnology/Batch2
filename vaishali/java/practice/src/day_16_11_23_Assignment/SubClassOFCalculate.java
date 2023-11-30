package day_16_11_23_Assignment;

public class SubClassOFCalculate implements Calculate {

	public static void main(String[] args) {
		SubClassOFCalculate calculate=new SubClassOFCalculate();
		calculate.calculate(12,5);

	}

	@Override
	public void calculate(int value1, int value2) {
		System.out.println(value1+value2);
	}

}
