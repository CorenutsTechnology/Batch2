package com.cnts.nov15;

public class NonAccessSubClass extends NonAccessModifiers
{

	@Override
	void calculator2() {
System.out.println("this is the example of non-acess modifier - Abstract");		
	}
	
	public static void main(String[] args) {
		NonAccessSubClass class1 = new NonAccessSubClass();
		class1.calcultor(50, 23);
		class1.calculator2();
	}

}
