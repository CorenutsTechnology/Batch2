package day_15_11_23;

import day_15_11_23_Assignment.NonAccessModifiers;

public class SubClassOFNonAccessModifiers extends NonAccessModifiers{

	public static void main(String[] args) {
		NonAccessModifiers modifiers=new SubClassOFNonAccessModifiers();
		System.out.println(modifiers.finalValue);
		modifiers.finalMethod();
		modifiers.abstractMethod();
	}

	@Override
	public void abstractMethod() {
		System.out.println("abstract method");
	}

}
