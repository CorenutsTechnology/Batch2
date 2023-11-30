package day_15_11_23_Assignment;

public abstract class NonAccessModifiers {
	public final int finalValue=4;
//	abstract int abstarctValue; //abstract keyword can not be used for variables
	
	public final void finalMethod() {
		System.out.println("final method");
	}
	
	
	
//	public abstract void abstractMethod() {
//		System.out.println("abstract method"); //abstract method does not have implementation
//	}
	
	public abstract void abstractMethod();
	
}
