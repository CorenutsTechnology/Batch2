//S,O 
package com.crnts.solid;

public class Billing {
	private Book book;
	private int quantity;
   private double total;
   

	public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}

	public Billing(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
		this.total = this.calculateTotal();
}
	public double calculateTotal() {
        double price = (book.price* this.quantity);
        return price;
}

  
    	 
	
}
