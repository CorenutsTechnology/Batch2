package day_20_11_23_Assignment;

public class Q7_CallingClass {

	public static void main(String[] args) {
		Q7_CalledClass calledClass=new Q7_CalledClass();
		System.out.println("calling class");
		try {
			int result=calledClass.function1(10, 0);
			System.out.println(result);
		} catch (RuntimeException e) {
			System.err.println("Exception : "+e);
		}
	}

}
