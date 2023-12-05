package com.cnts.throwthrows_20;

import java.io.FileInputStream;

public class CheckedExceptionExample {
	
	public void fileException () throws PathNotFoundException{
		//FileInputStream fileInputStream = new FileInputStream("/home:swa");
		
		throw new PathNotFoundException("file is not found");
		
		
	}
	public static void main(String[] args) {
		CheckedExceptionExample checkedExceptionExample = new CheckedExceptionExample();
		try {
			checkedExceptionExample.fileException();
			
		}catch(PathNotFoundException e) {
			System.out.println(e.message);
		}
		
		
		
		
		
		
	}
		
	
	

}
