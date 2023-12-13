package com.org.accessModifiers15;

public class AccessClassPropMain extends AccessClassprop  {

	public static void main(String[] args) {
		
		
		/*AccessClassprop accessClassprop=new  AccessClassprop();
		System.out.println(accessClassprop.publicValue1);
		//System.out.println(accessClassprop.privateValue1);
		System.out.println(accessClassprop.defaultValue);
		System.out.println(accessClassprop.protectedValue);
		
		accessClassprop.protectedMethod();
		accessClassprop.publicMethod();
		accessClassprop.defaultMethod();
		//accessClassprop.privateMethod();*/
		
		AccessClassPropMain accessClassprop=new  AccessClassPropMain();
		System.out.println(accessClassprop.publicValue1);
		//System.out.println(accessClassprop.privateValue1);
		System.out.println(accessClassprop.protectedValue);
		System.out.println(accessClassprop.defaultValue);
		accessClassprop.protectedMethod();
		accessClassprop.publicMethod();
		accessClassprop.defaultMethod();
		//accessClassprop.privateMethod();
		
	}

}
