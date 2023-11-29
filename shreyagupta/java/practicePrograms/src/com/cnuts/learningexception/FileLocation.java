package com.cnuts.learningexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileLocation implements FindFile {

	@Override
	public void fileLocation() {

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream(
					"C:\\Users\\Shreya Gupta\\Desktop\\TEJAS SIR(2ND)\\Advnce Aptitude TEST.docx");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
					System.out.println("Current file closed");
				} catch (IOException e) {
					
					System.out.println("Exception occured: " + e);
				}
			}else {
				System.out.println(fileInputStream);
			}
		}

	}

}
