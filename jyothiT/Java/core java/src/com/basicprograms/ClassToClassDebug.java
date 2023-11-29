package com.basicprograms;

class Parent
{
	 void add() 
	 {
	 		int value1=10;
	 		int value2=20;
	 		int sum=value1+value2;
	 		System.out.println(sum);
	 		
	 	}

}
class Child extends Parent
{
	 void sub()
	{
		int v1=20;
		int v2=10;
		int sub=v1-v2;
		System.out.println(sub);
	}
}

public class ClassToClassDebug {
	
		 public static void main(String[] args) {
		  
			Child c=new Child();
			c.add();
			c.sub();
		}
}
