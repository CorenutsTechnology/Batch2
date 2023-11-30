package day_15_11_23;

import day_15_11_23_Assignment.AccessModifiers;

public class AccessProperties {

	public static void main(String[] args) {
		AccessModifiers modifiers=new AccessModifiers();
		System.out.println(modifiers.publicValue);
		modifiers.publicMethod();
	}

}
