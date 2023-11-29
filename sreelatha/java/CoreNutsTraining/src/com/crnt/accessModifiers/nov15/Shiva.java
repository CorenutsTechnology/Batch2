package com.crnt.accessModifiers.nov15;

public class Shiva  extends ClassPropertiesThroughtObjInheritence{
	public static void main(String[] args) {
		Shiva a = new Shiva();
		a.classTest(5, -1);
		a.test();
		
	}
	public void test()
	{
		classTest(4,-3);
	}

}
