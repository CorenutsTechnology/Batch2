package day_16_11_23_Assignment;

public class SubClassOfFunctionsInInterface implements FunctionsInInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method 1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method 2");
	}
	
//	@Override
//	public void method3() {
//		// TODO Auto-generated method stub
//		System.out.println("method 3");
//	}

//	@Override
//	public void method4() {
//		// TODO Auto-generated method stub
//		System.out.println("method 4");
//	}// functions in an interface with all access modifiers by default it is taking as public abstract
	
	public static void main(String[] args) {
		SubClassOfFunctionsInInterface function=new SubClassOfFunctionsInInterface();
		
		function.method1();
		function.method2();
//		function.method3();
//		function.method4();
	}

	
	
}
