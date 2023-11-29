package com.crnt.test.nov;

import com.crnt.bean.AccesSpecifier_Bean;

public class AccesSpecifier_15 extends AccesSpecifier_Bean{
	public static void main(String[] args) {
		//from same package
//		AccesSpecifier accesSpecifier = new AccesSpecifier();
//		accesSpecifier.objectCreation();
//		AccesSpecifier1 accesSpecifier1 = new AccesSpecifier1();
//		accesSpecifier1.extendProperties();
		
		//from different package
		AccesSpecifier_15 accesSpecifier_15=new AccesSpecifier_15();
		System.out.println(accesSpecifier_15.stringValue2);
//		System.out.println(accesSpecifier_15.stringValue);//private
//		System.out.println(accesSpecifier_15.stringValue1);//default
		System.out.println(accesSpecifier_15.stringValue3);
		
		//Difference between default
		
	}

	
}

class AccesSpecifier {
	public void objectCreation() {
		System.out.println("object creation ");

	}
}

class AccesSpecifier1 extends AccesSpecifier2 {
	public void extendProperties() {
		System.out.println("subclass ");
		super.extendProperties1();
	}
}

class AccesSpecifier2 {
	public void extendProperties1() {
		System.out.println("super class ");
		AccesSpecifier3 accesSpecifier3=new AccesSpecifier3();
		//System.out.println(accesSpecifier3.stringValue); this private variable
		System.out.println(accesSpecifier3.stringValue1);//default
		System.out.println(accesSpecifier3.stringValue2);//public
		System.out.println(accesSpecifier3.stringValue3);//protected
//		accesSpecifier3.privateMethod(); it show error
		accesSpecifier3.defaultMethod();
		accesSpecifier3.publicMethod();
		accesSpecifier3.protectedMethod();
	}
}
class AccesSpecifier3 {
	private String stringValue = "private";
	        String stringValue1 = "default";
	public String stringValue2 = "public";
	protected String stringValue3="protected";
	public void publicMethod() {
		System.out.println("public Method ");
	}
	 void defaultMethod() {
		System.out.println("default Method ");
	}
	 private void privateMethod() {
			System.out.println("private Method ");
		}
	protected void protectedMethod() {
			System.out.println("protected Method ");
		}

}

