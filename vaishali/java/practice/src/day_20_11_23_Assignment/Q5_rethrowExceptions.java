package day_20_11_23_Assignment;

public class Q5_rethrowExceptions {

	public static void main(String[] args) {
		Q5_rethrowExceptions rethrow=new Q5_rethrowExceptions();
		try {
			System.out.println("try block of main");
			rethrow.function();
		} catch (Exception e) {
			System.out.println("catch block of main");
			System.out.println("Exception : "+e.getMessage());
		}
	}
	
	public void function() {
		int result=0;
		try {
			result=calculate(12, 0);
			System.out.println("try block of method result : "+result);
		} catch (Exception e) {
			System.out.println("catch block of method");
				result=calculate(12, 0);
		}
	}
	
	public int calculate(int value1,int value2) {
		return  (value1/value2);
	}
}
