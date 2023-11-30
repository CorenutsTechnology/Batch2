package day_16_11_23_Assignment;

public interface Interfaces {
	
	void method1() ;
	
	 static void method2() {
		System.out.println("method two");
	}
	 
	 default void method3() {
		 System.out.println("method three");
	 }
	
}
