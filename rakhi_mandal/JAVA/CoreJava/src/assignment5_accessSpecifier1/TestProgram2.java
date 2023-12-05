package assignment5_accessSpecifier1;

import assignment5_accessSpecifier.Program2;

public class TestProgram2 extends Program2 {
	static Program2 Program2= new Program2();  //need to import
	public static void main(String[] args) {
//		-----------variables--------------
//		System.out.println(Program2.type1); //accessed
//		System.out.println(Program2.getType2()); //can be accessed by getter and setter methods
//		System.out.println(Program2.getType3()); //can be accessed by getter and setter methods
//		System.out.println(Program2.getType4()); //can be accessed by getter and setter methods

//		------------methods---------------
		TestProgram2 testProgram2=new TestProgram2();
		testProgram2.testMethods();
		
		
	}
	public void testMethods()
	{
		
		publicMethod();//accessed
//		defaultMethod();
		protectedMethod();//can be accessed by inheritance
//		privateMethod();
	}

}
