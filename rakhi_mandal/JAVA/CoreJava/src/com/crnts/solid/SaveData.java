//S,O 
package com.crnts.solid;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveData extends Billing {
public SaveData(Book book, int quantity) {
		super(book, quantity);
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
//		Billing billing=new Billing(new Book("Java", "Herbert", 2017, 450), 2);
		SaveData saveData=new SaveData(new Book("Java", "Herbert", 2017, 450), 2);
		saveData.calculateTotal();
		saveData.printInvoice();
		saveData.saveToTextFile();
//		saveData.saveToTextFile(saveData, "C:/Users/Rakhi Mandal/Desktop/saveData.txt");
//		Billing_S billing = new Billing_S();
	
	}

	public void saveToTextFile(/*Billing billing, String filename*/) {
		
		
		
		System.out.println("Code to save data in file");
		
//    	        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
//    	            writer.println(billing.getQuantity() + " x " + billing.getBook().name +
//    	                    " = Rs" + billing.getBook().price);
//    	            writer.println("Total: " + billing.getTotal());
//    	            System.out.println("File saved successfully.");
//    	        } catch (IOException e) {
//    	            System.err.println("Error writing to file: " + e.getMessage());
//    	        }
    	    
}


	public void printInvoice() {
		System.out.println(getQuantity() + " x " + getBook().name + " = Rs" + getBook().price);
		System.out.println("Total: " + getTotal());
		System.out.println("done");
	}
}
