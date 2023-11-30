package com.case1;

import java.io.IOException;

class Hostel{
	public void beds() throws NullPointerException{
		System.out.println("beds are not available");
	}
}
public class Case4 extends Hostel{
	public void beds()throws Exception {
		System.out.println("beds are available");
	}
	public static void main(String[] args) {
		Case4 case4 = new Case4();
		case4.beds();
	}

}
