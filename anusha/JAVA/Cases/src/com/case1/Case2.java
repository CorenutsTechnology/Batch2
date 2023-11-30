package com.case1;

class Apple{
	public void market() {
		System.out.println("apple fruits are available");
	}
}
public class Case2 extends Apple
{
	public void market() throws ArithmeticException{
		System.out.println("apple fruits are available");
	}
	public static void main(String[] args) {
		Case2 case2 = new Case2();
		case2.market();
}

}
