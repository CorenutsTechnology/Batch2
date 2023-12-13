package com.org.ExceptionOverride22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Bike {
public void ride() throws FileNotFoundException 
{
	System.out.println("bike riding");
	FileInputStream fileInputStream = new FileInputStream("d:deskop\\feuji");
}
public void color()throws FileNotFoundException
{
	System.out.println("color in yamaha");
}
}
