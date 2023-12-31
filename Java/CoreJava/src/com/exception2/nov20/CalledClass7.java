package com.exception2.nov20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CalledClass7
{
	public void findFile() throws FileNotFoundException
	{
		System.out.println("trying to find file...");
		FileInputStream file = new FileInputStream("C:\\Users\\Welcome\\Documents\\MyDocuments\\PRAVALIKA_DASARI.pdf");
		if(file!=null)
		{			
			try {
				System.out.println("file is found!");
				file.close();
				System.out.println("file is closed!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("findFile method is ended");

	}
}
//PRAVALIKA_DASARI_RESUME.pdf