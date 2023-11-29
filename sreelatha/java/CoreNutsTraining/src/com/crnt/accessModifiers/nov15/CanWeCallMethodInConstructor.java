package com.crnt.accessModifiers.nov15;

 class ConstructorClass//remove invalid modifier if we use
 //class access modifier is private or protected
{
	 //ConstructorClass constructor = new ConstructorClass();
	public ConstructorClass() {
		
		ConstructorClass.test();// if it is nonstatic method :cannot make a 
		//static reference to the
		//non-static method test() from the type ConstructorClass
	}
	public static  void test()
	{
		System.out.println("constructor method");
	}
}
public class CanWeCallMethodInConstructor {
	
public static void main(String[] args) {
	
	ConstructorClass constructor1 = new ConstructorClass();
	
	
}

}

