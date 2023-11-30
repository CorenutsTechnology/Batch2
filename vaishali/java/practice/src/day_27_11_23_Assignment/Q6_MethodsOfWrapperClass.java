package day_27_11_23_Assignment;

public class Q6_MethodsOfWrapperClass {

	public static void main(String[] args) {
		
		Integer value1=new Integer(10);
		Integer value2=new Integer("10");
		System.out.println("compareTo method - "+value1.compareTo(value2));
		
		System.out.println("equals method - "+value1.equals(value2));
		
		System.out.println("pow method - "+Math.pow(5, 3));
		
		System.out.println("sqrt method - "+Math.sqrt(144));
		
		System.out.println("integer min value - "+Integer.MIN_VALUE);
	}

}
