package day_09_11_23_Assignment;

public class TernaryOperators {
	
	public static void main(String[] args) {
		TernaryOperators operators=new TernaryOperators();
		System.out.println(operators.ternary(12, 13));
	}
	public String ternary(int value1,int value2) {
		String result=(value1>value2)?"condition true":"condition false";
		return result;
	}
}
