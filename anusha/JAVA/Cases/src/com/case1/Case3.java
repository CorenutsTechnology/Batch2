package com.case1;

import java.io.FileNotFoundException;
import java.io.IOException;

class Tiger{
	public void sound() throws Exception{
		System.out.println("tiger.......");
	}
}
public class Case3 extends Tiger
{
	public void sound() throws ArithmeticException{
		System.out.println("tiger roars");
	}
	public static void main(String[] args) {
		Case3 case3 = new Case3();
		case3.sound();
	}

}
