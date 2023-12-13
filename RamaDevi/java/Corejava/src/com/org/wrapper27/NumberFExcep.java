package com.org.wrapper27;

public class NumberFExcep {
public  void NumF()
{
	String str1="25";
	String str2="277";
	String str3="87f";
//	int intNum=Integer.parseInt(str1);
//	System.out.println("int val is:"+intNum);
	byte bytenum=Byte.parseByte(str2);
	System.out.println("byte is:"+bytenum);
}
	public static void main(String[] args) {
		NumberFExcep numberfE=new NumberFExcep();
		numberfE.NumF();

	}

}
