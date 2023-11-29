package Strings;

import static org.hamcrest.CoreMatchers.equalTo;

import static org.hamcrest.CoreMatchers.equalToObject;

import java.nio.Buffer;

public class Comapring { /* extends StringBuilder */  //compiletime error final class of String buffer and Builder

	public static void main(String[] args) {
		String Stringname = "Kalyani";
		//String string1 = Stringname;
		 String string1=new String("kalyani");

		System.out.println(string1 == Stringname);
		System.out.println(string1.equals(Stringname));
		System.out.println(string1.equalsIgnoreCase(string1));
	}

}
