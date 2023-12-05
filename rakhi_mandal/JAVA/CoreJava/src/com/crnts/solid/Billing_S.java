//S,O 
package com.crnts.solid;

public class Billing_S extends Billing {
	public Billing_S(Book book, int quantity) {
		super(book, quantity);
		// TODO Auto-generated constructor stub
	}
//
//	public static void main(String[] args) {
//		Billing_S billing = new Billing_S(new Book("Java", "Herbert", 2017, 450), 2);
//		billing.printInvoice();
//	}

	public void printInvoice() {
		System.out.println(getQuantity() + " x " + getBook().name + " = Rs" + getBook().price);
		System.out.println("Total: " + getTotal());
		System.out.println(" Billing done");
	}

}
