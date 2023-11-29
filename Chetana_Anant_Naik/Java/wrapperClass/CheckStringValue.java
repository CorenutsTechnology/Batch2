package wrapperClass;

import java.util.Scanner;

public class CheckStringValue {
public static void main(String[] args)  {
	CheckStringValue checkStringValue=new CheckStringValue();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String stringvalue=sc.next();
	checkStringValue.checkStringValue(stringvalue);
}
void checkStringValue(String stringvalue) {
	try {
  int value=Integer.parseInt(stringvalue);
  System.out.println("this is number");
	}
	catch(NumberFormatException e) {
		System.out.println("this is String");
	}
}
}
