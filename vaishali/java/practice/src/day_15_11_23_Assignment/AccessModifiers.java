package day_15_11_23_Assignment;

public class AccessModifiers {
	private int privateVAlue;
	boolean defaultValue;
	protected double protectedValue;
	public String publicValue;
	
	private void privateMethod() {
		System.out.println("private access modifier");
	}
	 void defaultMethod() {
		System.out.println("default access modifier");
	}
	protected void protectedMethod() {
		System.out.println("protected access modifier");
	}
	public void publicMethod() {
		System.out.println("public access modifier");
	}
	
}
