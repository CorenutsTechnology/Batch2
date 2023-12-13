package com.feujisolidprinciple;

public class FileManager 
{
	/* File management class handling multiple responsibilities
	example of Single Resposibility
*/	  
	public void readFile(String fileName) {
	        System.out.println("Read file...");
	    }

	    public void writeFile(String fileName, String data) {
	        System.out.println("data is written on the file...");
	    }

	    public void manipulateFile(String fileName) {
	        System.out.println("file manipulated...");
	    }
	

}
