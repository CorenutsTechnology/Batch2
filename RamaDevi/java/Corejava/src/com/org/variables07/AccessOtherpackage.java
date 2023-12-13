package com.org.variables07;

import com.org.accessModifiers15.AccessClassprop;

public class AccessOtherpackage {

	public static void main(String[] args) {
		AccessClassprop accessClassprop=new AccessClassprop();
		System.out.println(accessClassprop.publicValue1);
		accessClassprop.publicMethod();
		//accessClassprop.defaultValue;
		//System.out.println(accessClassprop.protectedValue);

	}

}
