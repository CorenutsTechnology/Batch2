//S,O 
package com.crnts.solid;

public class Book {
	String name;
	String authorName;
	int year;
	int price;

	public Book(String name, String authorName, int year, int price) {
		this.name = name;
		this.authorName = authorName;
		this.year = year;
        this.price = price;
}

	@Override
	public String toString() {
		return "Book [name=" + name + ", authorName=" + authorName + ", year=" + year + ", price=" + price + "]";
	}
	
}
