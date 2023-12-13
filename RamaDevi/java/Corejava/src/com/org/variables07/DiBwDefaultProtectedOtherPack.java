package com.org.variables07;

import com.org.accessModifiers15.DiffBwDefaultProtected;

public class DiBwDefaultProtectedOtherPack extends DiffBwDefaultProtected {
	
	public static void main(String[] args) {
		DiBwDefaultProtectedOtherPack diff=new DiBwDefaultProtectedOtherPack();
		System.out.println(diff.protectValue);
		diff.protectMethod();
		
		//System.out.println(diff.defaultValue);
		//diff.defaultMethod();

	}

}
