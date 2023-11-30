package day_20_11_23_Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q1_CheckedException {
	
	FileInputStream fileInputStream=null;
	
	public static void main(String[] args) throws FileNotFoundException{
		Q1_CheckedException checkedException=new Q1_CheckedException();
			checkedException.file();
	}
	public void file() throws FileNotFoundException {
		System.out.println("file method start");
		try {
		fileInputStream=new FileInputStream("C:\\Users\\vaish\\OneDrive\\Desktop\\Mock\\finalMock\\src\\finalMock\\EvenDigit.java");
			if(fileInputStream==null) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());
		}
		finally {
			try {
				if(fileInputStream!=null) {
					try {
						fileInputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
