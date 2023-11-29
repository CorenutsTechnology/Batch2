package com.crnt.accessModifiers.nov15;

public class FinalClassTest extends FinalMethod/* extends */ /*FinalClass*/{//he type FinalClassTest cannot subclass the final class FinalClass
	public static void main(String[] args) {
		/* public static final */ /*void test()*///illegal modifier 
		{
			System.out.println("final method");
		}
		
	}

}
