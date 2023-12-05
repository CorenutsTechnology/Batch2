package com.cnts.exceptions_17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIndexException3 implements file3{

	@Override
	public void fileException() {
		FileInputStream fileInputStream=null;
		
		try {
			fileInputStream = new FileInputStream ("/home:swa");
			
		}catch(FileNotFoundException e)
		{
			System.out.println("file not found exception "+e.getMessage());
		}finally {
			System.out.println("hello");
			try {
				
				if(fileInputStream !=null) {
					fileInputStream.close();
					
				}
				
			} catch (IOException e) {
				
				System.out.println("IoException "+e.getMessage());

				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		FileIndexException3 fileIndexException3 = new FileIndexException3();
		fileIndexException3.fileException();
		
	}

}
