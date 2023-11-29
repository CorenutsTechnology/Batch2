package com.crnuts.impleClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.crnuts.test.FileLocationTest;

public class FileLocationn {

	public void fileLocation() {

		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream(
					"C:\\Users\\Shreya Gupta\\Desktop\\TEJAS SIR(2ND)\\TEST SERIES 1 - Copy.docx");
			System.out.println("File is present");
		} catch (FileNotFoundException e) {
		System.err.println("File not found, Exception handled by user");
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
					System.out.println("File has been closed");
				} catch (IOException e) {

					System.out.println(e);
				}

			} else {
				System.out.println("file: " + fileInputStream);
			}
		}

	}

}
