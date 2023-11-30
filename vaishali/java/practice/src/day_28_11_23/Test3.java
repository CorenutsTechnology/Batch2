package day_28_11_23;

public class Test3 {

	public <T> void genericMethod(T value1) {
		System.out.println(value1);
	}
	
	public static void main(String[] args) {
		Test3 test=new Test3();
		
		test.<Integer>genericMethod(12);
		
		test.<String>genericMethod("hi");
		
		test.genericMethod(29);
		
	}

}
