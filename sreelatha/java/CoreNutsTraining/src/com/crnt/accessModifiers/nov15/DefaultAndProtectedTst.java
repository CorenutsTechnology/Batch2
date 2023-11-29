package com.crnt.accessModifiers.nov15;

public class DefaultAndProtectedTst {
	public static void main(String[] args) {
		DefaultAndProtectedTst d = new DefaultAndProtectedTst();
		d.protectedTest();
		
	}
	public void defaultTest()
	{
		
	}
	public void protectedTest()
	{
		ProtectedMethods p = new ProtectedMethods();
		p.test();
	}
	

}
