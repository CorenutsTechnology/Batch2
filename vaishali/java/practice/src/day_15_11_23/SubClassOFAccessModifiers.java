package day_15_11_23;

import day_15_11_23_Assignment.AccessModifiers;

public class SubClassOFAccessModifiers extends AccessModifiers{

	public static void main(String[] args) {
		SubClassOFAccessModifiers modifiers=new SubClassOFAccessModifiers();
		System.out.println(modifiers.protectedValue);
		System.out.println(modifiers.publicValue);
		modifiers.protectedMethod();
		modifiers.publicMethod();
	}

}
