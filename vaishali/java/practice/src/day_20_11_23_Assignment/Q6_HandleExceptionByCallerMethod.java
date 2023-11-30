package day_20_11_23_Assignment;

public class Q6_HandleExceptionByCallerMethod {

	public static void main(String[] args) {
		Q6_HandleExceptionByCallerMethod callerMethod=new Q6_HandleExceptionByCallerMethod();
		System.out.println("calling  main method");
		callerMethod.function1();
		System.out.println("end of main method");
	}

	public void function1() {
		System.out.println("called function1");
		try {
			function2();
		}
		catch(Exception e) {
			System.err.println("exception : "+e);
		}
		System.out.println("calling function1");
	}
	public void function2() throws Exception {
		System.out.println("called function2");
		int value=12/0;
		System.out.println("end of function2");
	}
}
